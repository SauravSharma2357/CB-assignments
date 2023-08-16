package assignment_3_arrays;

import java.util.Scanner;

public class Q398_Arrays_Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]= kc.nextInt();
		}
		int M = kc.nextInt();
		System.out.println(Search(arr,M));
	}
	public static int Search(int[] arr, int M) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==M) {
				return i;
			}
		}
		return -1;
	}

}
