package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q1376_Mapped_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String n = kc.next();
		mappedStrings(n,"");
	}
	
	public static void mappedStrings(String ques, String ans) {
		
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		
		for(int i=0; i<ques.length();i++) {
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			char ch = ques.charAt(i);
			mappedStrings(s1+s2, ans+ch);
		}
	}

}
