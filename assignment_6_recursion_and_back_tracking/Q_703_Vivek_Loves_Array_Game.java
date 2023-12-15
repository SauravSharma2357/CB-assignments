package assignment_6_recursion_and_back_tracking;

import java.util.Scanner;

public class Q_703_Vivek_Loves_Array_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int t = kc.nextInt();
		while (t-- > 0) {
			int n = kc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = kc.nextInt();
			}
			System.out.print(Vivek(arr, 0, n - 1));
		}
	}

	public static int Vivek(int[] arr, int si, int ei) {

		for (int mid = si; mid < ei; mid++) {
			
			int sum1=0;
			for(int i=si; i<=mid; i++) {  // here doing that partition in this loop
				sum1+=arr[i];
			}
			
			int sum2=0;
			for(int i=mid+1; i<=ei; i++) {
				sum2+=arr[i];
			}
			
			if(sum1==sum2) {
				int lf = Vivek(arr,si,mid);
				int rf = Vivek(arr,mid+1,ei);
				return Math.max(lf, rf)+1; // +1 because we did the first partition we have to count thath
			}
		}
		
		return 0; // if we get out of the loop  means we didnt get any partition so return 0
	}

}
