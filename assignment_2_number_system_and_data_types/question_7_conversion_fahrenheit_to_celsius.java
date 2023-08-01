package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_7_conversion_fahrenheit_to_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int min = kc.nextInt();
		int max = kc.nextInt();
		int step = kc.nextInt();
		int cel=0;
		for(int i=min;i<=max;i+=step) {
			cel=(int)((5.0/9)*(i-32));
			System.out.println(i + " " + cel);
		}
		

	}

}
