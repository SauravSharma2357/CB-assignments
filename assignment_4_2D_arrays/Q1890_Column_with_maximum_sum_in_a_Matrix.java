package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q1890_Column_with_maximum_sum_in_a_Matrix {

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
			MaxSumRow(arr);
		}
		public static void MaxSumRow(int[][] arr) {
			int Max=0;
			int count=0;
			int col=0;
			int[] oned= new int [arr[0].length];
			for(int i=0;i<arr[0].length;i++) {
				for(int j=0;j<arr.length;j++) {
					oned[j]=arr[j][i];
				}
				int M = MaxSum(oned);
				count++;
				if(M>Max) {
					Max=M;
					col=count;
				}
			}
			System.out.print(col+" "+Max);
		}
		public static int MaxSum(int[] oned) {
			int Sum=0;
			for(int i=0;i<oned.length;i++) {
				Sum=Sum+oned[i];
			}
			return Sum;
		}

}
