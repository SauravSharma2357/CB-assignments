package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q1373_Recursion_Convert_String_to_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String s = kc.next();
		convert(s,0);
	}
	
	public static void convert(String s, int ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch = s.charAt(0);
		int n = (ch-'0');
		convert(s.substring(1), (ans*10)+n);
	}

}
