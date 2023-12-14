package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q142_Odd_Even_Using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		oddEven(n);
	}
	
	public static void oddEven(int n) {
		if(n==0) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
		}
		oddEven(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
	}

}
