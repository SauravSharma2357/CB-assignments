package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q508_Recursion_Lexicographical_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		Lexico(n,0);
	}
	public static void Lexico(int n,int curr) {
		if(curr>n) {
			return;
		}
		System.out.print(curr+" ");
		int i =0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			Lexico(n,curr*10+i);
		}
	}

}
