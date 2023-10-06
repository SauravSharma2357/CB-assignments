package assignment_5_String;

import java.util.*;

public class Q1369_Strings_Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		Duplicates(str,"");
	}
	public static void Duplicates(String str, String ans) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			for(int j=i+1;j<str.length();) {
				char ch1 = str.charAt(j);
				if(ch==ch1) {
					break;
				}
				else {
					ans=ans+ch;
					break;
				}
				
			}
		}
		System.out.println(ans+str.charAt(str.length()-1));
	}

}
