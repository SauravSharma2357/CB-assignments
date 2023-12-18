package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q187_Count_Remove_and_Replace_hi {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String s = kc.next();
		crr(s,0,"");
	}

	public static void crr(String s, int idx,String ans) {
		if(idx==s.length()-1) {
			System.out.println(count);
			System.out.println(ans);
			return;
		}
		if(s.charAt(idx)=='h' && s.charAt(idx+1)=='i') {
			count++;
		} else {
			ans = ans + s.charAt(idx);
		}
		crr(s,idx+1,ans);
	}

}
