package assignment_3_arrays;

import java.util.Scanner;

public class Q1493_Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		long[] arr = new long[N];
		for(int i=0;i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		Product(arr);
	}
	public static void Product(long[] arr) {
		int N=arr.length;
		long[] left = new long[N];
		long[] right = new long[N];
		for(int i=1;i<left.length;i++) {
			left[0]=1;
			left[i]=arr[i-1]*left[i-1];
		}
		for(int j=right.length-2;j>=0;j--) {
			right[right.length-1]=1;
			right[j]=arr[j+1]*right[j+1];
		} 
		for(int k=0;k<left.length;k++) {
			left[k]=left[k]*right[k];
		}
		for(int l=0;l<left.length;l++) {
			System.out.print(left[l]+" ");
		}
	}

}
