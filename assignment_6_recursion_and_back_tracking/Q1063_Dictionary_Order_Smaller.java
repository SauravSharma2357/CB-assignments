package assignment_6_recursion_and_back_tracking;

import java.util.Arrays;
import java.util.Scanner;

public class Q1063_Dictionary_Order_Smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String ques = kc.next();
		char[] chars = ques.toCharArray();
		Arrays.sort(chars);
		String str = new String(chars);
		DicOrder(str,ques,"");
	}
	public static void DicOrder(String str, String ques, String ans) {
		if(str.length()==0) {
			for(int j=0; j<ans.length();j++) {
				if(ans.charAt(j)<ques.charAt(j)) {
					System.out.println(ans);
					return;
				}
				else if(ans.charAt(j)>ques.charAt(j)) {
					return;
				}
			}
			return;
		}
		for(int i=0;i<str.length();i++) {
		String s1 = str.substring(0,i);
		String s2 = str.substring(i+1);
		char ch = str.charAt(i);
		DicOrder(s1+s2,ques,ans+ch);
		}
	}

}
