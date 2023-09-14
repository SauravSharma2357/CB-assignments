package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q43_KTH_ROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		long T = kc.nextLong();
		for(long i=1;i<=T;i++) {
			long n = kc.nextLong();
			long k = kc.nextLong();
			System.out.println(kthroot(n,k));
		}
	}
	public static long kthroot(long n, long k) {
		long si = 1;
		long ei = n;
		long ans = 0;
		while(si<=ei) {
			long mid = (si+ei)/2;
			if(Math.pow(mid, k)<=n) {
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
