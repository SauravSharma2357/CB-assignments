package assignment_3_arrays;

import java.util.Scanner;

public class Q1003_Pair_of_Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(;T>0;T--) {
			int N = kc.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<arr.length;i++) {
				arr[i] = kc.nextInt();
			}
			int M = kc.nextInt();
			Pairs(arr,M);
		}

	}
	public static void Pairs(int[] arr, int M) {
		Sort(arr);
		int A=0;
		int B=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==M) {
					A=arr[i];
					B=arr[j];
				}
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + A+" and "+B+".");
		System.out.println();
	}
	public static int[] Sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int mini=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[mini]>arr[j]) {
					mini=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[mini];
			arr[mini]=temp;
		}
		return arr;
	}

}
