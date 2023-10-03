package assignment_5_String;

import java.util.*;

public class Q165_Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int S = kc.nextInt();
		String str = kc.next();

		System.out.println(CBNUM(str));;
	}

	public static int CBNUM(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				String s = str.substring(i, j);
				long n = Long.parseLong(s);
				if (isvalid(n) == true && visited(visited, i, j - 1) == true) {
					count++;
					for(int k=i;k<j;k++) {
						visited[k]=true;
					}
				}

			}
		}
		return count;
	}

	public static boolean isvalid(long n) {
		if (n == 0 || n == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (n % arr[j] == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean visited(boolean[] visited, int i, int j) {
		for(;i<=j;i++) {
			if(visited[i]==true) {
				return false;
			}
		}
		return true;
	}

}
