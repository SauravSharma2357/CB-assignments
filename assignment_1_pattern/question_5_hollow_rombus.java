package assignment_1_pattern;

import java.util.Scanner;

public class question_5_hollow_rombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int star=n;
		int space = n-1;
		while (row<=n) {
			int i = 1;
			while (i<=space) {
				System.out.print(" ");
				i++;
			}
			int j =1;
			while (j<=star) {
				if (j==1 || j==n) {
					System.out.print("*");
				}
				else if (row==1 || row==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			row++;
			space--;
		}
			

}
}
