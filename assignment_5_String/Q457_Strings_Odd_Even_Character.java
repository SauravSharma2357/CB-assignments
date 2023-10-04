package assignment_5_String;

import java.util.*;

public class Q457_Strings_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		OE(str,"");
	}
	public static void OE(String str, String ans) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(i%2==0) {
				ans = ans+((char)((int)(ch)+1));
			}
			else {
				ans = ans+((char)((int)(ch)-1));
			}
		}
		System.out.println(ans);
	}

}
