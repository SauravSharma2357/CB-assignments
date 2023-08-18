package assignment_3_arrays;

import java.util.Scanner;

public class Q1938_Running_Sum_of_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=kc.nextInt();
		}
		RunningSum(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public static int[] RunningSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sum+arr[i];
			sum=arr[i];
		}
		return arr;
	}

}
