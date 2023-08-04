package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class Q1040_gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner kc = new Scanner(System.in);
//		int n1 = kc.nextInt();
//		int n2 = kc.nextInt();
//		int gcd=0;
//		for(int i=1;i<=n2;i++) {
//			if(n1%i==0 && n2%i==0) {
//				gcd=i;
//			}
//			
//		}
//		System.out.println(gcd);
		Scanner kc = new Scanner(System.in);
		int divisor = kc.nextInt();
		int divident = kc.nextInt();
		while(divident%divisor!=0) {
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println(divisor);

	}

}
