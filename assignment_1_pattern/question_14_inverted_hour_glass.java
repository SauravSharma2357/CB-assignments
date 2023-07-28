package assignment_1_pattern;

import java.util.Scanner;

public class question_14_inverted_hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int num=1;
		int val=n;
		int space=n*2-1;
		while(row<=2*n+1) {
			int i=1;
			int count=n;
			while(i<=num) {
				System.out.print(count+" ");
				i++;
				count--;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			int count2=val;
			if(row==n+1) {
				k=2;
				count2=1;
			}
			while(k<=num) {
				System.out.print(count2+" ");
				k++;
				count2++;
			}
			System.out.println();
			if(row<(n+1)) {
				space-=2;
				num++;
				val--;
			}
			else {
				space+=2;
				num--;
				val++;
			}
			row++;
			
			
		}

	}

}
