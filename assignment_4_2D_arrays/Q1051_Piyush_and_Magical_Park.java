package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q1051_Piyush_and_Magical_Park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int M = kc.nextInt();
		int K = kc.nextInt();
		int S = kc.nextInt();
		String[][] arr = new String[N][M];
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				arr[i][j] = kc.next();
			}
		}
		Magical(arr,K,S);
	}
	public static void Magical(String[][] arr, int K, int S) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(S<=K) {
					System.out.println("No");
					return;
				}
				else if(arr[i][j].equals(".")) {
					S=(S-2)-1;
				}
				else if(arr[i][j].equals("*")) {
					S=(S+5)-1;
				}
				else if(arr[i][j].equals("#")) {
					S=S-1;
					break;
				}
			}
			S=S+1;
		}
		System.out.println("Yes"+ "\n"+ S);
		
	}
}
