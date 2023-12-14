package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q526_First_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = kc.nextInt();
		}
		int m = kc.nextInt();
		lastIndex(arr,m,0);
	}
	
	public static void lastIndex(int[] arr, int m, int i) {
		if(arr[i]==m) {
			System.out.println(i);
			return;
		}
		if(i==arr.length-1) {
			System.out.println(-1);
			return;
		}
		
		lastIndex(arr,m,i+1);
	}

}
