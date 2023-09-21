package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q1892_A_Boolean_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int m = kc.nextInt();
		int n = kc.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = kc.nextInt();
			}
		}
		BooleanMatrix(arr);
	}
	public static void BooleanMatrix(int[][] arr) {
		int[][] New = new int [arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==1) {
					Update(i,j,New);
				}
			}
		}
		for (int m = 0; m < New.length; m++) {
			for (int n = 0; n < New[0].length; n++) {
				System.out.print(New[m][n]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] Update(int i, int j,int[][] New) {
		for(int k=0;k<New[0].length;k++) {
			New[i][k]=1;
		}
		for(int l=0;l<New.length;l++) {
			New[l][j]=1;
		}
		return New;
	}

}
