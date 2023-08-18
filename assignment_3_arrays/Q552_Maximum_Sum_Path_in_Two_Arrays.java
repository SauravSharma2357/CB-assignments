package assignment_3_arrays;

import java.util.Scanner;

public class Q552_Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i=1;i<=T;i++) {
			int N1 = kc.nextInt();
			int N2 = kc.nextInt();
			int[] arr1 = new int[N1];
			int[] arr2 = new int [N2];
			for(int j=0;j<arr1.length;j++) {
				arr1[j]=kc.nextInt();
			}
			for(int k=0;k<arr2.length;k++) {
				arr2[k]=kc.nextInt();
			}
			MaxSum(arr1,arr2);
		}
	}
	public static void MaxSum(int[] arr1, int[] arr2) {
		int sum1=0;
		int sum2=0;
		int max=0;
		for(int i=0;i<arr1.length;i++) {
			sum1=sum1+arr1[i];
		}
		for(int j=0;j<arr2.length;j++) {
			sum2=sum2+arr2[j];
		}
		if(sum1>sum2) {
			max=sum1;
		}
		else {
			max=sum2;
		}
		Array1Max(arr1,arr2,max);
	}
	public static void Array1Max(int[] arr1,int[] arr2,int max) {
		for(int k=0;k<arr1.length;k++) {
			int sum3=0;
			for(int l=0;l<arr2.length;l++) {
				
				if(arr1[k]==arr2[l]) {
					for(int m=0;m<k;m++) {
						sum3=sum3+arr1[m];
					}
					for(int n=l;n<arr2.length;n++) {
						sum3=sum3+arr2[n];
					}
				}
			}
			if(sum3>max) {
				max=sum3;
			}
		}
		Array2Max(arr1,arr2,max);
	}
	public static void Array2Max(int[] arr1,int[] arr2,int max) {
		for(int k=0;k<arr2.length;k++) {
			int sum3=0;
			for(int l=0;l<arr1.length;l++) {
				
				if(arr2[k]==arr1[l]) {
					for(int m=0;m<k;m++) {
						sum3=sum3+arr2[m];
					}
					for(int n=l;n<arr1.length;n++) {
						sum3=sum3+arr1[n];
					}
				}
			}
			if(sum3>max) {
				max=sum3;
			}
		}
		System.out.println(max);
	}

}
