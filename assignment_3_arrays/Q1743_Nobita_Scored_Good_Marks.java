package assignment_3_arrays;

import java.util.Scanner;

public class Q1743_Nobita_Scored_Good_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i=1;i<=T;i++) {
			int X = kc.nextInt();
			int N = kc.nextInt();
			System.out.println(Nobita(X,N));
		}
	}
	public static int Nobita(int X, int N) {
		int rem=0;
		if(X>N) {
			rem = X%N;
			if(rem>N/2) {
				rem=N-rem;
			}
		}
		else {
			rem=N-X;
		}
		return rem;
	}

}
