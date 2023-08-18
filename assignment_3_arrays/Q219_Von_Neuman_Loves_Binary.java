package assignment_3_arrays;

import java.util.Scanner;

public class Q219_Von_Neuman_Loves_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		for(int i=1;i<=N;i++) {
			int B = kc.nextInt();
			System.out.println(Decimal(B));
		}
	}
	public static int Decimal(int B) {
		int sum=0;
		int mul=1;
		while(B>0) {
			int rem = B%10;
			sum=sum+rem*mul;
			B/=10;
			mul*=2;
		}
		return sum;
	}

}
