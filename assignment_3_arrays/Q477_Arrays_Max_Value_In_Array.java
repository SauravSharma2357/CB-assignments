package assignment_3_arrays;

import java.util.Scanner;

public class Q477_Arrays_Max_Value_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		System.out.println(Max(arr));
	}
	public static int Max(int[] arr) {
		int max= Integer.MIN_VALUE;
			for(int j=0;j<arr.length;j++) {
				if(max<arr[j]) {
					max = arr[j];
				}
			}
		return max;
	}

}
