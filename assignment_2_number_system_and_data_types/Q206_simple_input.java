package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class Q206_simple_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc =new Scanner(System.in);
		long i =0;
		while(i>=0) {
			long n = kc.nextLong();
			i=i+n;
			if(i<0) {
				break;
			}
			System.out.println(n);
		}
		
		

	}

}
