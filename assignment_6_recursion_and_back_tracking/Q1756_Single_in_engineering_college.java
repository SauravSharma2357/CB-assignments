package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q1756_Single_in_engineering_college {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int[] arr = new int[n];
		int i = 0;
		while(n-- > 0) {
			arr[i] = kc.nextInt();
		}
		
		int x = kc.nextInt();
		height(arr,x,);
	}
	
	public static void height(int[] arr, int x) {
		
		if(x==0) {
			System.out.println(height);
			return;
		}
		
		
	}

}
