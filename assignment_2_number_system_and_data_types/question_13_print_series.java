package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_13_print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N1 = kc.nextInt();
		int N2 = kc.nextInt();
		int series = 0;
		int count = 1;
		for(int i=1;count<=N1;i++) {
			series=(3*i)+2;
			if(series%N2!=0) {
				System.out.println(series);
				count++;
			}
			
			
		}
		

	}

}
