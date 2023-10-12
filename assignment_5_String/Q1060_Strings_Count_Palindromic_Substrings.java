package assignment_5_String;

import java.util.Scanner;

public class Q1060_Strings_Count_Palindromic_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		StringCount(str,"");
	}
	public static void StringCount(String str,String ans) {
		int count =0;
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++) {
				ans=(str.substring(i,j));
				if(Check(ans)==true) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static boolean Check(String ans) {
		int si=0;
		int ei=ans.length()-1;
		while(si<ei) {
			if(ans.charAt(si)!=ans.charAt(ei)) {
				return false;
			}
			si++;
			ei--;
		}
		return true;
	}

}
