package assignment_1_pattern;

import java.util.Scanner;

public class question_3_mirror_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star=1;
		int row=1;
		int space=n/2;
		while(row<=n){
			int i = 1;
			while (i<=space) {
				System.out.print("  ");
				i++;
			}
			int j =1;
			while (j<=star) {
				System.out.print("* ");
				j++;
			}
			if (row<=n/2) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
			}
			System.out.println();
			row++;
		}

	}

}
