package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q234_Mazepath_D_Count_Print {

	static int count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N1 = kc.nextInt();
		int N2 = kc.nextInt();
		MazePath(N1-1,N2-1,0,0,"");
		System.out.println();
		System.out.println(count);
	}
	public static void MazePath(int er, int ec,int cr, int cc, String ans) {
		if(cr==er && cc==ec) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		if(cr>er || cc>ec) {
			return;
		}
		MazePath(er,ec,cr+1,cc,ans+'V');
		MazePath(er,ec,cr,cc+1,ans+'H');
		MazePath(er,ec,cr+1,cc+1,ans+'D');
	}

}
