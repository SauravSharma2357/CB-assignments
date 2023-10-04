package assignment_5_String;

import java.util.Scanner;

public class Q489_Strings_Difference_in_Ascii_Codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		Difference(str,"");
	}
	public static void Difference(String str, String ans) {
		for(int i=0;i<str.length();i++) {
			char ch1 = str.charAt(i);
			if(i==str.length()-1) {
				ans=ans+ch1;
				break;
			}
			char ch2 = str.charAt(i+1);
			ans=ans+ch1+((int)(ch2)-(int)(ch1));
		}
		System.out.println(ans);
	}

}
