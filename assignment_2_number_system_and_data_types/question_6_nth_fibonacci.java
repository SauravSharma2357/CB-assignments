package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_6_nth_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int n1=0;
		int n2=1;
		int n3=0;
		for(int i=0;i!=n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}
		System.out.println(n1);

	}

}
