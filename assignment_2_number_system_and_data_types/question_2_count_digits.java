package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_2_count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dig = sc.nextInt();
		int count=0;
		int rem = 0;
		while(num!=0) {
			rem=num%10;
			if(rem==dig) {
				count++;
			}
			num=num/10;
			
		}
		System.out.println(count);

	}

}
