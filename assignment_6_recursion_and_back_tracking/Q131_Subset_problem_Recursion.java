package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q131_Subset_problem_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length;i++) {
			arr[i]=kc.nextInt();
		}
		int T = kc.nextInt();
		Subset(arr,T,0);
	}
	public static void Subset(int[] arr, int t,int i) {
		for(;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==t) {
					System.out.println(arr[i]+" "+arr[j]);
					break;
				}
			}
		}
	}

}
