package assignment_3_arrays;

import java.util.Scanner;

public class Q1075_Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i=0;i<=T;i++) {
			int N = kc.nextInt();
			int[] arr = new int[N];
			for(int j=0;j<arr.length;j++) {
				arr[j]=kc.nextInt();
			}
			int[] X = Permutation(arr);
			for(int k=0;k<X.length;k++) {
				System.out.print(arr[k]+" ");
			}
		}
	}
	public static int[] Permutation(int[] arr) {
		int N=arr[arr.length-1];
		for(int i=N;i>=0;) {
			int j=i-1;
			if(arr[j]<arr[i]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			else{
				i--;
			}
		}
		return arr;
	}

}
