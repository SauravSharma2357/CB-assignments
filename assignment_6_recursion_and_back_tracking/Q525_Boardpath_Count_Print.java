package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q525_Boardpath_Count_Print {

	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int M = kc.nextInt();
		Board(N,M,"",0);
		System.out.println("\n"+count);
	}
	public static void Board(int n, int m,String ans, int idx) {
		if(idx>n) {
			return;
		}
		if(idx==m) {
			count++;
			System.out.print(ans+" ");
			return;
		}
		for(int i=1;i<=m;i++) {
			Board(n,m,ans+i,idx+i);
		}
	}

}
