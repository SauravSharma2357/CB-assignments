package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q525_Boardpath_Count_Print {

	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int M = kc.nextInt();
//		int[] arr = new int[M];
//		int counter = 1;
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=counter;
//			counter++;
//		}
		Board(N,0,M,"");
		System.out.println("\n"+count);
	}
	public static void Board(int end, int curr, int diceFaces,String ans) {
		
		if(curr==end) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		if(curr>end) {
			return;
		}
		for(int i=1;i<=diceFaces;i++) {	
			Board(end,curr+i,diceFaces,ans+i);
		}
	}

}
