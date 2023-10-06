package assignment_5_String;

import java.util.*;

public class Q503_Strings_isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		System.out.println(Pallindrome(str));
	}
	public static boolean Pallindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
