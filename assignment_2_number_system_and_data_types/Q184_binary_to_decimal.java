package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class Q184_binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem=0;
		int sum=0;
		for(int mul=1;n!=0;mul=mul*2) {
			rem=n%10;
			sum=sum+rem*mul;
			n=n/10;
		}
		System.out.println(sum);
	}

}
