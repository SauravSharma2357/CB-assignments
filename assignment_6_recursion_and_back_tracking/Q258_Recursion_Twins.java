package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q258_Recursion_Twins {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		Twins(str,0);
	}
	public static void Twins(String str, int count) {
		if(str.length()<3) {
			System.out.println(count);
			return;
		}
		if(str.charAt(0)==str.charAt(2) && str.charAt(0)!=str.charAt(1)) {
			count++;
		}
		Twins(str.substring(1), count);
	}

}
