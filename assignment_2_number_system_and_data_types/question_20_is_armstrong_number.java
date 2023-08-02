package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_20_is_armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int rem=0;
		int arm=0;
		int i=n;
		int count=0;
		for(i=n;i>0;i=i/10) {
			rem=i%10;
			count++;
			i=i/10;
		}
		System.out.println(count);

	}

}
