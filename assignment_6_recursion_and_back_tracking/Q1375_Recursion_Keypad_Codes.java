package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q1375_Recursion_Keypad_Codes {
	static String[] map = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String n = kc.next();
		codes(n,"");
	}
	
	public static void codes(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		String key = map[ch-'0'];
		for(int i=0;i<key.length();i++) {
			codes(ques.substring(1), ans+key.charAt(i));
		}
	}

}
