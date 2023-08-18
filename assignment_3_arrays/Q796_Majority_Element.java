package assignment_3_arrays;

import java.util.Scanner;

public class Q796_Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i =0;i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		Sort(arr);
		Majority(arr,N);
	}
	public static void Majority(int[]arr,int N) {
		int count=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					count++;
				}
			}
			if(count>=N/2) {
				System.out.println(arr[i]);
				break;
			}
		}
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
