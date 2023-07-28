package assignment_1_pattern;

import java.util.Scanner;

public class question_7_fibonacci_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int a=0;
		int b=1;
		int c=0;
		int num=1;
		while(row<=n) {
			int i=1;
			while (i<=num) {
				System.out.print(a);
				i++;
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
			row++;
			num++;
		}
		
		

	}

}
