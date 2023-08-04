package assignment_1_pattern;

import java.util.Scanner;

public class Q75_pattern_double_sided_arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int num=1;
		int space1=n-1;
		int space2=-1;
		while (row<=n) {
			int i=1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int count=num;
			while(j<=num) {
				System.out.print(count+" ");
				j++;
				count--;
			}
			int l =1;
			while(l<=space2) {
				System.out.print("  ");
				l++;
			}
			int k=1;
			int count2=1;
			if(row==1 || row ==n) {
				k=2;
			}
			while(k<=num) {
				System.out.print(count2+ " ");
				k++;
				count2++;
			}
			System.out.println();
			if(row<=n/2) {
				space1-=2;
				space2+=2;
				num++;
			}
			else {
				space1+=2;
				space2-=2;
				num--;
			}
			row++;
		}

	}

}
