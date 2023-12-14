package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q1374_All_Indices_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]= kc.nextInt();
		}
		int m = kc.nextInt();
		indicies(arr,0,m);
	}
	
	public static void indicies(int[] arr, int i, int m) {
		if(i==arr.length) {
			return;
		}
		if(arr[i]==m) {
			System.out.print(i+" ");
		}
		indicies(arr,i+1,m);
	}

}
