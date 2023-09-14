package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q411_Arrays_Spiral_Print_Anticlockwise {

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
		int L = arr.length * arr[0].length;
		int[] spiral = new int[L];
		SpiralAntiClockWise(arr, spiral);
		for (int i = 0; i < spiral.length; i++) {
			System.out.print(spiral[i] + ", ");
		}
		System.out.print("END");
	}

	public static int[] SpiralAntiClockWise(int[][] arr, int[] spiral) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int count = 0;
		int p = 0;
		int te = arr.length * arr[0].length;
		while (count < te) {
			for (int i = minr; i <= maxr && count < te; i++) {
				spiral[p] = arr[i][minc];
				count++;
				p++;
			}
			minc++;
			for (int i = minc; i <= maxc && count < te; i++) {
				spiral[p] = arr[maxr][i];
				count++;
				p++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count < te; i--) {
				spiral[p] = arr[i][maxc];
				count++;
				p++;
			}
			maxc--;
			for (int i = maxc; i >= minc && count < te; i--) {
				spiral[p] = arr[minr][i];
				count++;
				p++;
			}
			minr++;
		}
		return spiral;
	}
}
