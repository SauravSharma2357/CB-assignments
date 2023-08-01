package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_1_sum_of_odd_placed_and_even_placed_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		int even=0;
		int odd=0;
		for(int i=1;n!=0;i++) {
			rem=n%10;
			if(i%2==0) {
				even=even+rem;
			}
			else {
				odd=odd+rem;
			}
			n=n/10;
		}
		System.out.println(even + "\n" + odd);

	}

}
