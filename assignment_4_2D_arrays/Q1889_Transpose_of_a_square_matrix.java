package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q1889_Transpose_of_a_square_matrix {

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
		TransposeMatrix(arr);
	}
	public static void TransposeMatrix(int[][] arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr[0].length;j++) {
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
