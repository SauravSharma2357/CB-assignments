package assignment_5_String;

import java.util.Scanner;

public class Q66_Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		for(int i=0;i<str.length();i++) {
			char a = str.charAt(i);
			if((int)(a)<97) {
				System.out.println();
			}
			System.out.print(str.charAt(i));
		}
		
	}

}
