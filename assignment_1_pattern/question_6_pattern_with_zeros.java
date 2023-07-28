package assignment_1_pattern;

import java.util.Scanner;

public class question_6_pattern_with_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int num =1;
		while(row<=n) {
			int i= 1;
			while (i<=num) {
				if(i==1 || i==row) {
					System.out.print(row);
				}
				else {
					System.out.print("0");
				}
				i++;
			}
			System.out.println();
			row++;
			num++;
		}

	}

}
