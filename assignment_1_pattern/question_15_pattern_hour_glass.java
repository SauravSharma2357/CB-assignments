package assignment_1_pattern;

import java.util.Scanner;

public class question_15_pattern_hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int num=2*n+1;
		int space=0;
		int count=n;
		while(row<=n+1) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			int val=n;
			while(j<=num) {
				System.out.print(val+"\t");
				if(j<=(n+1)) {
					val--;
				}
				else {
					val++;
				}
				j++;
			}
			System.out.println();
			if(row<=n+1) {
				space++;
				count--;
				num--;
			}
			else {
				space--;
				count++;
				num++;
			}
			row++;
			
		}
			
	}

}
