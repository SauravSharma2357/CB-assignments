package assignment_3_arrays;

import java.util.Scanner;

public class Q1366_Arrays_Reverse_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		Reverse(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]+" ");
		}
	}
	public static int[] Reverse(int[] arr) {
		int i=0;
		int j=arr.length-1;
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
