package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_20_is_armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int rem=0;
		int arm=0;
		int j=n;
		int count=0;
		while(j!=0) {
			j=j/10;
			count++;
		}
		for(int i=n;i>0;i=i/10) {
			rem=i%10;
			arm=(int)(arm+Math.pow(rem, count));
		}
		if(arm==n) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		

	}

}
