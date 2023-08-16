package assignment_3_arrays;

import java.util.Scanner;

public class Q21_Inverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]= kc.nextInt();
		}
		int[] anb=Inverse(arr);
		for(int i=0;i<anb.length;i++) {
			System.out.print(anb[i] + " ");
		}
	}
	public static int[] Inverse(int[] arr) {
		int N = arr.length;
		int[] ans = new int[N];
			for(int i=0;i<arr.length;i++) {
				int j=N-i;
				int p=N-arr[i];
				if(arr[i]==0) {
					j=0;
					p=i;
				}
				ans[p]=j;
			}
		return ans;
	}
	

}
