package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class Q919_check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i!=0) {
				System.out.println("Prime");
				break;
			}
			else {
				System.out.println("Not Prime");
				break;
			}
		}

	}

}
