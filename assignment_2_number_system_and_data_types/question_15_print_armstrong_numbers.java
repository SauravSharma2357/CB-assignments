package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_15_print_armstrong_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N1 = kc.nextInt();
		int N2 = kc.nextInt();
		while(N1<=N2) {
			int i=N1;
			int rem=0;
			int arm=0;
			while(i!=0) {
				rem=i%10;
				arm=(int)(arm+Math.pow(rem, 3));
				i=i/10;
			}
			if(arm==N1) {
				System.out.println(arm);
			}
			N1++;
			
		}

	}

}
