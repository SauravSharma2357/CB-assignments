package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q384_Count_Remove_and_Replace_hi_part_2 {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String s = kc.next();
		String ans = "";
		ans = ans+s.charAt(0);
		crr(s.substring(1),ans,ans);
	}

	public static void crr(String ques, String ans, String ans2) {
		if(ques.length()==0) {
			System.out.println(count);
			System.out.println(ans);
			System.out.println(ans2);
			return;
		}
		if(ques.charAt(0) == 'i' && ans.charAt(ans.length()-1) == 'h' && (ques.length() == 1 || ques.charAt(1)!='t')) {
				count++;
				crr(ques.substring(1), ans.substring(0, ans.length()-1), ans2.substring(0, ans2.length()-1) + "bye");
		} else {
			crr(ques.substring(1), ans+ques.charAt(0), ans2+ques.charAt(0));
		}
	}

}
