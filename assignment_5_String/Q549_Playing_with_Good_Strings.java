package assignment_5_String;

import java.util.Scanner;

public class Q549_Playing_with_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		String str1 = "aeiou";
		Good(str, "", str1);
	}
	public static void Good(String str, String ans, String str1) {
		int max=0;
		for(int i=0;i<str.length();i++) {
			boolean bool = false;
			for(int j=0;j<str1.length();j++) {
				if(str.charAt(i)==str1.charAt(j)) {
					ans=ans+str.charAt(i);
					bool =true;
				}
			}
			max=Math.max(ans.length(), max);
			if(bool==false) {
				ans="";
			}
		}
		System.out.println(max);
	}
}
