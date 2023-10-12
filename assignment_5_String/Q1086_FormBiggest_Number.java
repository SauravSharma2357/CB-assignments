package assignment_5_String;

import java.util.Scanner;

public class Q1086_FormBiggest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int T = kc.nextInt();
		for(int i=1;i<=T;i++) {
			int N= kc.nextInt();
			int[] arr = new int[N];
			for(int j=0;j<arr.length;j++) {
				arr[j]= kc.nextInt();
			}
			Number(arr,"");
		}
	}
	public static void Number(int[] arr, String ans) {
		for(int i=0;i<arr.length;i++) {
			String s = Integer.toString(arr[i]);
			for(int j=i;j<arr.length;j++) {
				String s1 = Integer.toString(arr[j]);
				for(int n=0;n<s.length();n++) {
					char ch = s.charAt(n);
					char ch1 = s1.charAt(n);
					if (ch<ch1 || s.length()<s1.length()) {
						int temp = arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						break;
					}
				}
				
			}
			ans=ans+arr[i];
		}
		System.out.println(ans);
	}

}
