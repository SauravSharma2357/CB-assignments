package assignment_3_arrays;

import java.util.Scanner;

public class Q3922_How_many_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int count1 = 0;
		for(int i=1;i<=N;i++) {
			int[] arr = new int [3];
			for(int j=0;j<arr.length;j++) {
				arr[j] = kc.nextInt();
			}
			int X=Count(arr);
			count1=count1+X;
		}
		System.out.print(count1);
		
		}
	public static int Count(int[]arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
		}
		if(count==2 || count==3) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

}
