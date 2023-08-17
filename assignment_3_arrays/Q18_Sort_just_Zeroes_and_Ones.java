package assignment_3_arrays;

import java.util.Scanner;

public class Q18_Sort_just_Zeroes_and_Ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=kc.nextInt();
		}
		Sort(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
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
