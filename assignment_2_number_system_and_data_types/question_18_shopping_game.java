package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_18_shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		int i = 1;
		while(i<=T){
			int M = kc.nextInt();
			int N = kc.nextInt();
			int A=1;
			int B=2;
			int j=1;
			int AS=0;
			int BS=0;
			while(j!=0) {
				AS=AS+A;
				BS=BS+B;
				if (AS>=M) {
					System.out.println("Harshit");
					break;
				}
				else if(BS>N) {
					System.out.println("Aayush");
					break;
				}
				A=B+1;
				B=A+1;
				j++;
			}
			i++;
		}
			
	}

}
