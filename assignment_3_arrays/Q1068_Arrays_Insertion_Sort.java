package assignment_3_arrays;

import java.util.Scanner;

public class Q1068_Arrays_Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=kc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			InsertionSort(arr,j);
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]+" ");
		}

	}
	public static int[] InsertionSort(int[] arr, int i) {
		int j=i-1;
		int temp = arr[i];
		while(j>=0 && arr[j]>temp) {
			arr[j+1]=arr[j];
			arr[j]=temp;
			j--;
		}
		return arr;
	}

}
