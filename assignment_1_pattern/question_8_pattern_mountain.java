package assignment_1_pattern;

import java.util.Scanner;

public class question_8_pattern_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		int row=1;
		int space = n+1;
		while(row<=n) {
			int i=1;
			while(i<= num) {
				System.out.print(i);
				i++;
			}
			int j =1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			int k = 1;
			while(k<=num && k!=n) {
				System.out.print(k);
				k++;
			}
			System.out.println();
			row++;
			num++;
			space-=2;
		}

	}

}
