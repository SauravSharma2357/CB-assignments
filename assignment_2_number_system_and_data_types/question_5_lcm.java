package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_5_lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for(int i=1;i!=0;i++) {
			if(i%n1==0 && i%n2==0) {
				System.out.println(i);
				break;
			}
		}
		

	}

}
