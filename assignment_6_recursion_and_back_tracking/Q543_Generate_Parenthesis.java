package assignment_6_recursion_and_back_tracking;

import java.util.*;

public class Q543_Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		Paren(N,0,0,"");
	}
	public static void Paren(int n, int open,int close, String ans) {
		if(open==n && close==n) {
			System.out.println(ans);
			return;
		}
		if(close<open) {
			Paren(n,open,close+1,ans+")");
		}
		if(open<n) {
			Paren(n,open+1,close,ans+"(");
		}
	}

}
