package assignment_3_arrays;

import java.util.Scanner;

public class Q1943_Squares_of_a_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int [N];
		for(int i=0;i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		Square(arr);
		Sort(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public static int[] Square(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*arr[i];
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
