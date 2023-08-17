package assignment_3_arrays;

import java.util.Scanner;

public class Q413_Arrays_Target_Sum_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		int T = kc.nextInt();
		Sumpair(arr,N,T);
	}
	public static void Sumpair(int[] arr, int N, int T) {
		Sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==T) {
					System.out.println(arr[i]+" and "+arr[j]);
				}
			}
		}
	}
	public static int[] Sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int mini=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[mini]>arr[j]) {
					mini=j;
				}
			}
			int item=arr[i];
			arr[i]=arr[mini];
			arr[mini]=item;
		}
		return arr;
	}

}
