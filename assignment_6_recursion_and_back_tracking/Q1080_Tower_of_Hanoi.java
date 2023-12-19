package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q1080_Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		towerOfHanoi(n,'A', 'B', 'C');
	}

	private static void towerOfHanoi(int n, char src, char aux, char dest) {
		// TODO Auto-generated method stub
		if(n==1) {
			System.out.println(src + " -> " + dest);
			return;
		}
		
		towerOfHanoi(n-1, src, dest, aux);
		towerOfHanoi(1, src, aux, dest);
		towerOfHanoi(n-1, aux, src, dest);
	}
	

}
