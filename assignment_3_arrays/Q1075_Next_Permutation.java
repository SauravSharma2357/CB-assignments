package assignment_3_arrays;

import java.util.Scanner;

public class Q1075_Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i=1;i<=T;i++) {
			int N = kc.nextInt();
			int[] arr = new int[N];
			for(int j=0;j<arr.length;j++) {
				arr[j]=kc.nextInt();
			}
			int[] X=Permutation(arr);
			for(int k=0;k<X.length;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
	}
	public static int[] Permutation(int[] arr) {
		int N=arr.length-1;
		int count =0;
		for(int i=N;i>0;i--) {
			int j=i-1;
			if(arr[j]<arr[i]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				count++;
				break;
			}
		}
		if(count==0) {
			Sort(arr);
		}
		return arr;
	}
	public static int[] Sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int mini=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[mini]>arr[j]) {
					mini=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[mini];
			arr[mini]=temp;
		}
		return arr;
	}

}
