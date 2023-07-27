package assignment_1_pattern;

import java.util.Scanner;

public class question_4_number_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int count=1;
		while(row<=n) {
			int i=1;
			int num=count;
			while(i<=row) {
				System.out.print(num);
				i++;
				num++;
			}
			System.out.println();
			row++;
			count=num;
		}

	}

}
