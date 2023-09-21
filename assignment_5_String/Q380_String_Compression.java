package assignment_5_String;

import java.util.Scanner;

public class Q380_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		Compression(str);
	}
	public static void Compression(String str) {
		int count1=0;
		for(int i=0;i<str.length();) {
			char ch = str.charAt(i);
			int count2=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)==ch) {
					count1++;
					count2++;
				}
			}
			i=count1;
			System.out.print(ch+""+count2);
		}
	}
}
