package assignment_6_recursion_and_back_tracking;

import java.util.*;

public class Q131_Subset_problem_Recursion {

	static int count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		List<Integer> ques = new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		for(int i=0;i<n;i++) {
			ques.add(kc.nextInt());
		}
		int t = kc.nextInt();
		Subset(ques,ans,t);
		System.out.println();
		System.out.print(count);
	}
	public static void Subset(List<Integer> ques, List<Integer> ans, int t) {
		if(ques.size()==0) {
			int sum=0;
			for(int i=0;i<ans.size();i++) {
				sum = sum+ans.get(i);
			}
			if(sum==t) {
				count++;
				for(int i=0;i<ans.size();i++) {
					System.out.print(ans.get(i)+" ");
				}
				System.out.print("  ");
			}
			return;
		}
		int a = ques.get(0);
		int b = 1;
		ans.add(a);
		Subset(ques.subList(b, ques.size()),ans,t);
		ans.remove(ans.size()-1);
		Subset(ques.subList(b, ques.size()),ans,t);
	}

}
