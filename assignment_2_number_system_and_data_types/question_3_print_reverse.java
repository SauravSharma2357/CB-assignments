package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_3_print_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem=0;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		System.out.print(sum);
	}
}
