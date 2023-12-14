package assignment_6_recursion_and_back_tracking;

import java.util.*;

public class Q131_Subset_problem_Recursion {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kc.nextInt();
		}
		int t = kc.nextInt();
		Subset(arr,0,"",t,0);
		System.out.println();
		System.out.println(count);
	}
	public static void Subset(int[] arr, int i, String ans, int t,int sum) {
		if(i==arr.length) {
			if(sum==t) {
				System.out.print(ans+"  ");
				count++;
			}
			return;
		}
		
		Subset(arr,i+1,ans+arr[i]+" ",t,sum+arr[i]);
		Subset(arr,i+1,ans,t,sum);
	}

}
