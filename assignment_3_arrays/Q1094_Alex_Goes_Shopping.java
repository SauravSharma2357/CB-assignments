package assignment_3_arrays;

import java.util.Scanner;

public class Q1094_Alex_Goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] prices = new int[N];
		for(int i=0;i<prices.length;i++) {
			prices[i] = kc.nextInt();
		}
		int Q = kc.nextInt();
		int[] query = new int[2];
		for(int j=1;j<=Q;j++) {
			for(int k=0;k<query.length;k++) {
				query[k] = kc.nextInt();
			}
			Shopping(prices,query);
		}

	}
	public static void Shopping(int[] prices,int[] query) {
		int count = 0;
		for(int i=0;i<prices.length;i++) {
			if(query[0]%prices[i]==0) {
				count++;
				if(count==query[1]) {
					break;
				}
			}
		}
		if(count==query[1]) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
