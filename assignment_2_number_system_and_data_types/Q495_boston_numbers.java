package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class Q495_boston_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int sum1=0;
		int n1=n;
		while(n1!=1) {
			int i=2;
			while(i!=0) {
				if(n1%i==0) {
					break;
			}
				else {
					i++;
				}
			}
			n1=n1/i;
			int rem1=0;
			int sum3=0;
			while(i!=0) {
				rem1=i%10;
				sum3=sum3+rem1;
				i=i/10;
			}
			sum1=sum1+sum3;
		}
		int sum2=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			sum2=sum2+rem;
			n=n/10;
		}
		if(sum1==sum2) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}

}
