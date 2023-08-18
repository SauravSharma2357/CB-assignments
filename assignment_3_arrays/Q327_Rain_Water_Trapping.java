package assignment_3_arrays;

import java.util.Scanner;

public class Q327_Rain_Water_Trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i=1;i<=T;i++) {
			int N = kc.nextInt();
			int[] arr = new int[N];
			for(int j=0;j<arr.length;j++) {
				arr[j]=kc.nextInt();
			}
			System.out.println(Max(arr));
		}
	}
	public static int Max(int[] arr) {
		int N = arr.length;
		int[] left = new int[N];
		int[] right = new int[N];
		for(int i=1;i<left.length;i++) {
			left[0]=arr[0];
			left[i]=Math.max(left[i-1], arr[i]);
		}
		for(int j=right.length-2;j>=0;j--) {
			right[right.length-1]=arr[arr.length-1];
			right[j]=Math.max(right[j+1], arr[j]);
		}
		int sum=0;
		for(int k=0;k<left.length;k++) {
			sum=sum+(left[k]=(Math.min(left[k], right[k]))-arr[k]);
		}
		return sum;
	}

}
