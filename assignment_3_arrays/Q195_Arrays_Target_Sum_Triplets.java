package assignment_3_arrays;

import java.util.Scanner;

public class Q195_Arrays_Target_Sum_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i] = kc.nextInt();
		}
		int T = kc.nextInt();
		Triplet(arr,N,T);
	}
	public static void Triplet (int[] arr,int N, int T) {
		Sorted(arr);
		int i=0;
		while(i<arr.length-2) {
			int j=i+1;
			while(j<arr.length-1) {
				int k=j+1;
				while(k<arr.length) {
					if(arr[i]+arr[j]+arr[k]==T) {
						System.out.println(arr[i]+ ","+ arr[j]+ " and " + arr[k]);
						break;
					}
					k++;
				}
				j++;
			}
			i++;
		}
		
		
	}
	public static int[] Sorted(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int mini=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[mini]>arr[j]) {
					mini=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[mini];
			arr[mini]=temp;
		}
		return arr;
		
	}

}
