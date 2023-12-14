package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q_1379_Recursion_Subsequences {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String s = kc.next();
		subsequence(s,"");
		System.out.println();
		System.out.println(count);
	}
	
	public static void subsequence(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		char ch = ques.charAt(0);
		subsequence(ques.substring(1),ans);
		subsequence(ques.substring(1),ans+ch);
	}

}
