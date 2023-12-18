package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q240_Nth_Triangle_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		tri(n,0);
	}
	
	public static void tri(int n, int ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		tri(n-1,ans+n);
	}

}
