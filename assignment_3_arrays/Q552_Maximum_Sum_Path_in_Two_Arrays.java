package assignment_3_arrays;

import java.util.Scanner;

public class Q552_Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int t = kc.nextInt();
		for (int i = 1; i <= t; i++) {
			int n = kc.nextInt();
			int m = kc.nextInt();
			int[] arr1 = new int[n];
			int[] arr2 = new int[m];
			for (int j = 0; j < arr1.length; j++) {
				arr1[j] = kc.nextInt();
			}
			for (int k = 0; k < arr2.length; k++) {
				arr2[k] = kc.nextInt();
			}
			System.out.println(maxPathSum(arr1, arr2, n, m));
		}
	}

	public static int maxPathSum(int[] arr1, int[] arr2, int n, int m) {
		int i = 0;
		int j = 0;
		int result = 0;
		int sum1 = 0;
		int sum2 = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				sum1 = sum1 + arr1[i];
				i++;
			} else if (arr1[i] > arr2[j]) {
				sum2 += arr2[j];
				j++;
			} else {
				result = result + Math.max(sum1, sum2) + arr1[i];
				sum1 = 0;
				sum2 = 0;
				i++;
				j++;
			}
		}
		while (i < n) {
			sum1 = sum1 + arr1[i];
			i++;
		}
		while (j < m) {
			sum2 = sum2 + arr2[j];
			j++;
		}
		result = result + Math.max(sum1, sum2);
		return result;
	}
}