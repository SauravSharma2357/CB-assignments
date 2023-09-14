package assignment_4_2D_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q1894_Rowwise_sort_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int row = kc.nextInt();
		int col = kc.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = kc.nextInt();
			}
		}
		RowSorting(arr);
	}
	public static void RowSorting(int[][] arr) {
		int[] oned= new int [arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				oned[j]=arr[i][j];
			}
			Sort(oned);
		}
	}
	public static void Sort(int[] oned) {
		Arrays.sort(oned);
		for(int i=0;i<oned.length;i++) {
			System.out.print(oned[i]+" ");
		}
		System.out.println();
	}

}
