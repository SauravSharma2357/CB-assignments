package assignment_5_String;

import java.util.Scanner;

public class Q468_Strings_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		Compression(str,"");
	}
	public static void Compression(String str, String ans) {
		int count=0;
		for(int i=0;i<str.length();) {
			char ch = str.charAt(i);
			int j=i;
			for(;j<str.length();j++) {
				char ch1 = str.charAt(j);
				if(ch==ch1) {
					count++;
				}
				else if(ch!=ch1) {
					break;
				}
			}
			if(count==1) {
				ans=ans+ch;
			}
			else {
				ans=ans+ch+count;
			}
			count=0;
			i=j;
		}
		System.out.println(ans);
	}

}
