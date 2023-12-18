package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q564_Generate_Binary_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int t = kc.nextInt();
		while(t-- > 0) {
			String s = kc.next();
			generate(s,"");
			System.out.println();
		}
	}
	public static void generate(String ques, String ans) {
		
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		if(ch=='?') {
			generate(ques.substring(1), ans+"0");
			generate(ques.substring(1), ans+"1");
		} else {
			generate(ques.substring(1), ans+ch);
		}
	}

}
