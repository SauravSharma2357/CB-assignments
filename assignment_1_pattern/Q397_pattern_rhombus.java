package assignment_1_pattern;


import java.util.Scanner;

public class Q397_pattern_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int space = (n-1);
		int star=1;
		int val=1;
		while (row<=2*n-1) {
			int i =1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int p =val;
			while(j<=star) {
				System.out.print(p +" ");
				if (j<=star/2) {
					p++;
				}
				else {
					p--;
				}
				j++;
			}
			if(row<n) {
				space--;
				star=star+2;
				val++;
			}
			else {
				space++;
				star=star-2;
				val--;
			}
			System.out.println();
			row++;
			
		}

	}

}
