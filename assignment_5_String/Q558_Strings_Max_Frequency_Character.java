package assignment_5_String;

import java.util.*;

public class Q558_Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		Max(str);
	}
	public static void Max(String str) {
		int max = 0;
		int count=1;
		char print = 'a';
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			for(int j=i+1;j<str.length();j++) {
				char ch1 = str.charAt(j);
				if(ch==ch1) {
					count++;
				}
				else {
					break;
				}
			}
			if(count>max) {
				print = ch;
			}
			max=Math.max(max, count);
			count=1;
		}
		System.out.println(print);
	}

}
