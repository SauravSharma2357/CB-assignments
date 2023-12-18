package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q1381_Replace_all_pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int t = kc.nextInt();
		while(t-- > 0) {
			String s = kc.next();
			String ans = "";
			ans = ans + s.charAt(0);
			pi(s.substring(1), ans);
		}
	}
	
	public static void pi(String ques, String ans) {
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		char ch1 = ques.charAt(0);
		char ch2 = ans.charAt(ans.length()-1);
		if(ch1 == 'i' && ch2 == 'p') {
			pi(ques.substring(1), ans.substring(0, ans.length()-1) + "3.14");
		} else {
			pi(ques.substring(1), ans+ques.charAt(0));
		}
		
	}

}
