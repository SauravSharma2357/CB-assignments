package assignment_3_arrays;

import java.util.Scanner;

public class Q552_Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for (int i = 1; i <= T; i++) {
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
			System.out.println(maxPathSum(arr1, arr2,m,n));
		}
	}

	    public static int maxPathSum(int ar1[], int ar2[], int m, int n) {
	        int i = 0, j = 0;
	        int result = 0, sum1 = 0, sum2 = 0;
	        while (i < m && j < n) {
	            if (ar1[i] < ar2[j])
	                sum1 += ar1[i++];
	            else if (ar1[i] > ar2[j])
	                sum2 += ar2[j++];
	            else {
	                result += Math.max(sum1, sum2) + ar1[i];
	                sum1 = 0;
	                sum2 = 0;
	                i++;
	                j++;
	            }
	        }
	        while (i < m)
	            sum1 += ar1[i++];
	        while (j < n)
	            sum2 += ar2[j++];
	        result += Math.max(sum1, sum2);
	        return result;
	    }
	}