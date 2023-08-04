package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class Q853_odd_and_even_back_in_delhi {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in); 
		long N = kc.nextLong();
		for(int i=1;i<=N;i++) {
			long T = kc.nextLong();
			long rem = 0;
			long even = 0;
			long odd = 0;
			while(T!=0) {
				rem=T%10;
				if(rem%2==0) {
					even=even+rem;
				}
				else {
					odd=odd+rem;
				}
				T=T/10;
			}
			if(even%4==0 || odd%3==0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
