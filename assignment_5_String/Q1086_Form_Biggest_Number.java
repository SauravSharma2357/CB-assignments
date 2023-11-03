package assignment_5_String;

import java.util.*;

public class Q1086_Form_Biggest_Number {
	static String max="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i=1;i<=T;i++) {
			int N = kc.nextInt();
			List<String> arr = new ArrayList<>();
			for(int j=0;j<N;j++) {
				arr.add(kc.next());
			}
			Biggest(arr,"");
			System.out.println(max);
		}
	}
	public static void Biggest(List<String> ques, String ans) {
		if(ques.size()==0) {
			max=ans;
			return;
		}
		for(int i=0;i<ques.size();i++) {
			String s = ques.get(i);
			ques.remove(i);
			Biggest(ques,ans+s);
			ques.add(i,s);
		}
	}
}
