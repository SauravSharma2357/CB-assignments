package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q1012_Rotate_Image {

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
		RotateImage(arr);
	}
	public static void RotateImage(int[][] arr) {

		for(int i=arr[0].length-1;i>=0;i--) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
