package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_14_simple_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc =new Scanner(System.in);
		int i =1;
		while(i>0) {
			int n = kc.nextInt();
			int j=n;
			while(i>0) {
				j=j+n;
			}
			i=i+n;
		}
		
		

	}

}
