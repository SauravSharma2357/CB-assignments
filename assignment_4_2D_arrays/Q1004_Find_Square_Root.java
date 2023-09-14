package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q1004_Find_Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		System.out.println(Sqroot(N));
	}
	public static int Sqroot(int n) {
		int si = 1;
		int ei = n;
		int ans = 0;
		while(si<=ei) {
			int mid = (si+ei)/2;
			if(Math.pow(mid, 2)<=n) {
				ans=mid;
				si=mid+1;
			}
			else {
				ei = mid-1;
			}
		}
		return ans;
	}

}
