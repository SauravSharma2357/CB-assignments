package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q_703_Vivek_Loves_Array_Game {
	static int max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int t = kc.nextInt();
		while (t > 0) {
			int n = kc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = kc.nextInt();
			}
			Vivek(arr, 0, n - 1,0,0,0);
			t--;
			System.out.print(max);
		}
	}

	public static void Vivek(int[] arr, int left, int right,int c1,int c2,int max) {
		if (left == right) {
			return ;
		}
		int totalsum = 0;
		for (int i = left; i <=right; i++) {
			totalsum = totalsum + arr[i];
		}
		if (totalsum % 2 != 0) {
			return ;
		}
		int halfsum = totalsum / 2;
		int leftsum = 0;
		for (int i = left; i < right; i++) {
			leftsum = leftsum + arr[i];
			if (leftsum == halfsum) {
				Vivek(arr, left, i,c1++,c2,max);
				max=Math.max(max, c1);
				Vivek(arr, i + 1, right,c1,c2++,max);
				max=Math.max(max, c2);
			}
		}
	}

}
