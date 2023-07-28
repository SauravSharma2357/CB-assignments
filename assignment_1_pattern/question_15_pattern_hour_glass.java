package assignment_1_pattern;

import java.util.Scanner;

public class question_15_pattern_hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int col=2*n+1;
		int space=0;
		int count=n;
		while (row<=2*n+1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int num=count;
			while(j<=count+1) {
				System.out.print(num+" ");
				num--;
				j++;
			}
			int k=1;
			while(k<=count) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
			if(row<=n) {
				space++;
				count--;
			}
			else {
				space--;
				count++;
			}
			row++;
		}
		
	}

}
