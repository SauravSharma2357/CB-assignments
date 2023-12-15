package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q535_Rat_Chases_its_cheese {
	static boolean var = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int m = kc.nextInt();
		char[][] arr = new char[n][m];
		for(int i=0;i<arr.length;i++) {
			String s = kc.next();
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		mazePath(arr,0,0,ans);
		if(var==false) {
			System.out.println("NO PATH FOUND");
		}
	}
	
	public static void mazePath(char[][] arr, int i, int j, int[][] ans) {
		if(i==arr.length-1 && j==arr[0].length-1 && arr[i][j]!='X') {
			ans[i][j]=1;
			Display(ans);
			var=true;
			return;
		}
		if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j]=='X') {
			return;
		}
		arr[i][j]='X';
		ans[i][j]=1;
		int[] r = {-1,1,0,0};
		int[] c = {0,0,-1,1};
		for(int k=0;k<c.length;k++) {
			mazePath(arr,i+r[k],j+c[k],ans);
		}
		arr[i][j]='O';
		ans[i][j]=0;
	}
	
	public static void Display(int[][] ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
