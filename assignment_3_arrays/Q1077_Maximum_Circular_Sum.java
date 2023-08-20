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
		int max = Integer.MIN_VALUE;
		for(int j=0;j<arr.length;j++) {
			int sum = 0;
			int N = arr.length;
			for(int i=0;i<arr.length;i++) {
				sum =sum +arr[i];
				max= Math.max(max, sum);
				if(sum<0) {
					sum=0;
				}
			}
			Reverse(arr,0,N-2);
			Reverse(arr,N-1,N-1);
			Reverse(arr,0,N-1);
		}
		System.out.println(max);
		}
	public static int[] Reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	}
