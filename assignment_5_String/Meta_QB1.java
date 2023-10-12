package assignment_5_String;

import java.util.Scanner;

public class Meta_QB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i=1;i<=T;i++) {
			int P = kc.nextInt();
			Sum41(P,"");
		}
	}
	public static void Sum41(int p, String ans) {
		int si=1;
		int ei=41;
		while(si<=ei) {
			if(p%si==0) {
				ans=ans+si+" ";
			}
			else if(p%ei==0) {
				ans=ans+ei+" ";
			}
			si++;
			ei--;
		}
		System.out.println(ans);
	}

}
