package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_11_chewbacca_and_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int x = kc.nextInt();
		int sum = 0;
		int mul = 1;
		int t1=0;
		while(x!=0) {
			int t=x%10;
			t1=9-t;
			if(t1<t) {
				t=t1;
			}
			sum=sum+t*mul;
			x=x/10;
			mul=mul*10;
		}
		System.out.println(sum);

	}

}
