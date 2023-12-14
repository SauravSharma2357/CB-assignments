package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q2041_Replace_all_0s_with_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		
		System.out.println(zeroFive(n));
	}
	public static int zeroFive(int n) {
		if(n==0) {
			return 0;
		}
		int ld = n%10;
		if(ld==0) {
			ld=5;
		}
		 return zeroFive(n/10)*10 + ld;
	}
}
