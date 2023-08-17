package assignment_3_arrays;

import java.util.Scanner;

public class Q1089_Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i=1;i<=T;i++) {
			int[] prices = new int[4];
			for(int m=0;m<prices.length;m++) {
				prices[m] = kc.nextInt();
			}
			int[] times = new int[2];
			for(int j=0;j<times.length;j++) {
				times[j] = kc.nextInt();
			}
			int[] auto = new int[times[0]];
			for(int k=0;k<auto.length;k++) {
				auto[k]= kc.nextInt();
			}
			int[] cab = new int[times[1]];
			for(int l=0;l<cab.length;l++){
				cab[l]= kc.nextInt();
			}
			int M=Min(prices,auto);
			int N=Min(prices,cab);
			int Minimum = Math.min(M+N, prices[3]);
			System.out.println(Minimum);
		}
	}
	public static int Min(int[] prices, int[] vehical) {
		int A=0;
		int B=0;
		int min=0;
		int Mainmin=0;
		for(int i=0;i<vehical.length;i++) {
				A=vehical[i]*prices[0];
				B=prices[1];
				min=min+Math.min(A, B);
		}
		Mainmin=Math.min(min, prices[2]);
		return Mainmin;
	}

}
