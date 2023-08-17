package assignment_3_arrays;

import java.util.Scanner;

public class Q190_Arrays_Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		BubbleSort(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public static int[] BubbleSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}
