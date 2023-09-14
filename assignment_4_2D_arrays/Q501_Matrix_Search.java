package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q501_Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int M = kc.nextInt();
		int[][] arr = new int[N][M];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = kc.nextInt();
			}
		}
		int x = kc.nextInt();
		System.out.println(MatrixSearch(arr,x));
	}
	public static int MatrixSearch(int[][] arr, int x) {
		int row = 0;
		int col = arr[0].length-1;
		while(row<arr.length && col>=0) {
			if (arr[row][col] == x) {
				return 1;
			}
			else if(arr[row][col]>x) {
				col--;
			}
			else {
				row++;
			}
		}
		return 0;
	}

}
