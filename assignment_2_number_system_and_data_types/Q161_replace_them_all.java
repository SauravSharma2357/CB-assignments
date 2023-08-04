package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class Q161_replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		long n = kc.nextLong();
		long sum = 0;
		long mul = 1;
        if(n==0){
            n=5;
        }
		while(n!=0) {
			long rem = n%10;
			if(rem==0) {
				rem=5;
			}
			sum=sum+rem*mul;
			n=n/10;
			mul=mul*10;
		}
		System.out.println(sum);

	}

}
