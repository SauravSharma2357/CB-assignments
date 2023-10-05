package assignment_5_String;

import java.util.*;

public class Q1086_Form_Biggest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i=1;i<=T;i++) {
			int N = kc.nextInt();
			int[] arr = new int[N];
			for(int j=0;j<arr.length;j++) {
				arr[j]=kc.nextInt();
			}
			Biggest(arr,"");
		}
	}
	public static void Biggest(int[] arr, String ans) {
		String s = "";
		int max=0;
		for(int i=0;i<arr.length;i++) {
			s = s+arr[i];
			for(int j=0;j<s.length();j++) {
				if(s.charAt(0)>max) {
					
				}
			}
		}
	}

}
