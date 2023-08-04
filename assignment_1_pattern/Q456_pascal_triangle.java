package assignment_1_pattern;

import java.util.Scanner;

public class Q456_pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star =1;
		int row=0;
		while(row<n) {
			int i=0;
			int val = 1;  //This
			while(i<star) {
				System.out.print(val + " ");
				val = ((row-i)*val)/(i+1);
				i++;
			}
			System.out.println();
			row++;
			star++;
		}

	}

}