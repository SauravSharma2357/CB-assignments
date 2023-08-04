package assignment_1_pattern;

import java.util.Scanner;

public class Q740_pattern_magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star =n;
		int row=1;
		int space=-1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			//if (row==1 || row==2*n) {
			//	k=2;
			//}
			while(k<=star && k!=n) {
				System.out.print("*");
				k++;
				
			}
			System.out.println();
			if(row<=(2*n-1)/2) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			row++;
			
			
		}

	}

}
