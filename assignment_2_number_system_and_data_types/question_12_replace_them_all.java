package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_12_replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int sum = 0;
		int mul = 1;
		while(n!=0) {
			int rem = n%10;
			if(rem==0) {
				rem=5;
			}
			sum=sum+rem*mul;
			n=n/10;
			mul=mul*10;
		}
		System.out.println(sum);

	}

}
