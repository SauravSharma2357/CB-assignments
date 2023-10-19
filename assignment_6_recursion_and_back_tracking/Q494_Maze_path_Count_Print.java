package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q494_Maze_path_Count_Print {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int m = kc.nextInt();
		int[][] arr = new int[n][m];
		MazePath(arr,0,0,"");
		System.out.println("\n"+count);
	}
	public static void MazePath(int[][] arr, int i, int j, String ans) {
		if(i==arr.length-1 && j==arr[0].length-1) {
			count++;
			System.out.print(ans+" ");
			return;
		}
		if(i<0 || i>=arr.length || j<0 || j>=arr.length) {
			return;
		}
		MazePath(arr,i+1,j,ans+'V');
		MazePath(arr,i,j+1,ans+'H');
	}

}
