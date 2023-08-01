package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_8_inverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int sum=0;
		for(int i=1;n!=0;i++) {
			int rem=n%10;
			sum = (int)(sum+i*Math.pow(10, rem-1));
			n=n/10;
		}
		System.out.println(sum);

	}

}
