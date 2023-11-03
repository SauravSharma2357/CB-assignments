package assignment_5_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1086_Form_Biggest_Numbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i=1;i<=T;i++) {
			int N = kc.nextInt();
			String[] arr = new String[N];
			for(int j=0;j<N;j++) {
				arr[j]=kc.next();
			}
			Biggest(arr,"");
		}
	}
	public static void Biggest(String[] arr, String ans) {
		int y=3;
		while(y>0) {
		for(int j=0;j<arr.length-1;j++) {
		String a = arr[j];
		String b = arr[j+1];
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)<b.charAt(i)) {
				String temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		y--;
	}
	}

}
