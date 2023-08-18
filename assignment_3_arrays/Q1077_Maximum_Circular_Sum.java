package assignment_3_arrays;

import java.util.Scanner;

public class Q1077_Maximum_Circular_Sum {

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
			CircularSum(arr);
		}

	}
	public static void CircularSum(int[] arr) {
		int N = arr.length;
		int[] anb = new int[N];
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int k=i;k<arr.length-1;k+=2) {
				sum=sum+arr[k]+arr[(k-1+N)%N];
			}
			anb[i]=sum;
			
		}
		for(int j=0;j<anb.length;j++) {
			System.out.print(anb[j]+" ");
		}
	}

}
