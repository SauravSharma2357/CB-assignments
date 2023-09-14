package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q471_Arrays_Wave_print_Column_Wise {

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
		WavePrint(arr, wave);
		for (int i = 0; i < wave.length; i++) {
			System.out.print(wave[i] + ", ");
		}
		System.out.print("END");
	}

	public static int[] WavePrint(int[][] arr, int[] wave) {
		int p=0;
		for(int col =0;col<arr[0].length;col++) {
			if(col%2==0) {
				for(int row=0;row<arr.length;row++) {
					wave[p]=arr[row][col];
					p++;
				}
			}
			else {
				for(int row = arr.length-1;row>=0;row--) {
					wave[p]=arr[row][col];
					p++;
				}
			}
		}
		return wave;
	}

}
