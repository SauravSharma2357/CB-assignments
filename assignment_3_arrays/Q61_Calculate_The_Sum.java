package assignment_3_arrays;

import java.util.Scanner;

public class Q61_Calculate_The_Sum {
	public static void main(String[] args) {
		
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		int Q = kc.nextInt();
		for(int j=1;j<=Q;j++) {
			int X = kc.nextInt();
			Sum(arr,X);
		}
		int add=0;
		for(int j=0;j<arr.length;j++) {
			add=add+arr[j];
		}
		System.out.println(add);
	}
	public static int[] Sum(int[] arr, int X) {
		int N= arr.length;
		reverse(arr,0,N-X-1);
		reverse(arr,N-X,N-1);
		int temp[] = reverse(arr,0,N-1);
		for(int i=0;i<temp.length;i++) {
			arr[i]=temp[i]+arr[i];
		}
		return arr;
		
	}
	public static int[] reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}

}
