package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q1896_Mummys_motivational_speech {

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
		System.out.println(Triangle(arr));
	}
	public static boolean Triangle(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[0].length;j++) {
				if(arr[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}

}
