package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q410_Arrays_Wave_Print_Row_Wise {

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
		int[] wave = new int[L];
		WavePrint(arr, L, wave);
		for (int i = 0; i < wave.length; i++) {
			System.out.print(wave[i] + ", ");
		}
		System.out.print("END");
	}

	public static int[] WavePrint(int[][] arr, int L, int[] wave) {
		int i = 0;
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[0].length; col++) {
					wave[i] = arr[row][col];
					i++;
				}
			} else {
				for (int col = arr[0].length - 1; col >= 0; col--) {
					wave[i] = arr[row][col];
					i++;
				}
			}

		}
		return wave;
	}

}
