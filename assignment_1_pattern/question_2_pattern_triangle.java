package assignment_1_pattern;

import java.util.Scanner;

public class question_2_pattern_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int space = n-1;
		int num=1;
		while (row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			int j = 1;
			int count=row;
			while(j<=num) {
				System.out.print(count);
				j++;
				if(j<=row) {
				count++;
				}
				else {
					count--;
				}
			}
			System.out.println();
			row++;
			num+=2;
			space--;
		}

	}

}
