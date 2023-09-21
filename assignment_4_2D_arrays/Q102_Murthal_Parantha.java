package assignment_4_2D_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q102_Murthal_Parantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int P = kc.nextInt();
		int L = kc.nextInt();
		int[] R = new int[L];
		for(int i=0;i<R.length;i++) {
			R[i]=kc.nextInt();
		}
		Murthal(R,L,P);
	}
	public static void Murthal(int[] R, int L,int P) {
		int MT = Integer.MAX_VALUE;
		for(int i=0;i<R.length;i++) {
			int Count=1;
			while(R[i]<=P) {
				R[i]=Count*R[i];
				Count++;
			}
			if(R[i]<MT) {
				MT=R[i];
			}
		}
		System.out.println(MT);
	}

}
