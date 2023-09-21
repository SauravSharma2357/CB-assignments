package assignment_4_2D_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q1056_Aggressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int C = kc.nextInt();
		int[] stall = new int[N];
		for(int i=0;i<stall.length;i++) {
			stall[i]=kc.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(MaximumDistance(stall,C));
	}
	public static int MaximumDistance(int[] stall,int C) {
		int si=stall[0];
		int ei=stall[stall.length-1];
		int ans=0;
		while(si<=ei) {
			int mid = (si+ei)/2;
			if(isitpossible(stall,mid,C)==true) {
				ans=mid;
				si=mid+1;
			}
			else {
				ei=mid-1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] stall, int mid, int C) {
		int pos = stall[0];
		int cow=1;
		for(int i=0;i<stall.length;i++) {
			if(stall[i]-pos>=mid) {
				cow++;
				pos=stall[i];
			}
			if(cow==C) {
				return true;
			}
		}
		return false;
	}

}
