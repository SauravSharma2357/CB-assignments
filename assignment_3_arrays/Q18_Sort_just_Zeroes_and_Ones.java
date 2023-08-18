package assignment_3_arrays;

import java.util.Scanner;

public class Q18_Sort_just_Zeroes_and_Ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=kc.nextInt();
		}
		int[] X = Sort(arr);
		for(int j=0;j<X.length;j++) {
			System.out.print(X[j]+" ");
		}
	}
	public static int[] Sort(int[] arr) {
		int N =arr.length;
		int[] ans = new int[N];
		int j=0;
		int k=N-1;
		for(int i=0;i<arr.length;i++) {
			while(j<=k) {
				if(arr[i]==0) {
					ans[j]=arr[i];
					j++;
					break;
				}
				else {
					ans[k]=arr[i];
					k--;
					break;
				}
			}
		}
		return ans;
	}

}
