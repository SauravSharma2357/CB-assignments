package assignment_5_String;

import java.util.*;

public class Q445_Strings_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		Toggle(str,"");
	}
	public static void Toggle(String str, String ans) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if((int)(ch)<97) {
				char n = (char)((int)(ch)+32);
				ans=ans+n;
			}
			else {
				char m = (char)((int)(ch)-32);
				ans=ans+m;
			}
		}
		System.out.println(ans);
	}

}
