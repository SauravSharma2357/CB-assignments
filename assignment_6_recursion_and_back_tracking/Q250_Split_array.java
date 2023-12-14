package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q250_Split_array {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		int i = 0;
		while(N-- > 0) {
			arr[i]= kc.nextInt();
			i++;
		}
		
		split(arr,0,"","",0,0);
		System.out.println(count);
	}
	
	public static void split(int[] arr, int i, String ans, String ans1,int sum1,int sum2) {
		if(i==arr.length) {
			if(sum1==sum2) {
				System.out.println(ans+" and "+ans1);
				count++;
			}
			return;
		}
			
		split(arr,i+1,ans+arr[i]+" ", ans1,sum1+arr[i],sum2);
		split(arr,i+1,ans,ans1+arr[i]+" ",sum1,sum2+arr[i]);
	}

}
