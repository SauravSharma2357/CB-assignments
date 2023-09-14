package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q2617_Print_Upper_Triangular_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[][] arr = new int[N][N];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = kc.nextInt();
			}
		}
		Triangle(arr);
	}
	public static void Triangle(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				arr[i][j]=0;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
