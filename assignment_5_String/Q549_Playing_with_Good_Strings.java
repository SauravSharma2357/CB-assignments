package assignment_5_String;

import java.util.Scanner;

public class Q549_Playing_with_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		Good(str, "");
	}

	public static void Good(String str, String ans) {
		int max=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				String sb = str.substring(i,j);
				if(isgood(sb)==true) {
					max=Math.max(max, sb.length());
				}
			}
		}
		System.out.println(max);
	}
	public static boolean isgood(String sb) {
		int count=0;
		String str = "aeiou";
		for(int i=0;i<sb.length();i++) {
			char ch = sb.charAt(i);
			for(int j=0;j<str.length();j++) {
				if(ch==str.charAt(j)) {
					count++;
				}
			}
		}
		if(count==sb.length()) {
			return true;
		}
		else {
			return false;
		}
	}

}
