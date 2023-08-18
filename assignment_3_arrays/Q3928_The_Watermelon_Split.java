package assignment_3_arrays;

import java.util.Scanner;

public class Q3928_The_Watermelon_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int W = kc.nextInt();
		Split(W);
	}
	public static void Split(int W) {
		if(W==2) {
			W=3;
		}
		int rem = W%2;
		if(rem==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
