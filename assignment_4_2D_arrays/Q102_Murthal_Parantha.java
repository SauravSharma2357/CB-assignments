package assignment_4_2D_arrays;

import java.util.Scanner;

public class Q102_Murthal_Parantha {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int B = sc.nextInt();
			int S = sc.nextInt();
			int[] Pages = new int[B];
			for (int i = 0; i < Pages.length; i++) {
				Pages[i] = sc.nextInt();
			}
			
			System.out.println(parathaSpoj(Pages, B)) ;
			t--;
		}
		
	}

static boolean isvalid(int[] arr, int B, int mid) {
	int pages = 0;
	int cb = 0;
	for (int i = 0; i < arr.length; i++) {
		pages = arr[i];
	while (pages <= mid) {
		cb++;
		pages = pages + arr[i];
	}
	if (cb >= B) 
		return true;
	}
	
	return false;
}

static int parathaSpoj(int[] arr, int BOOKS) {
	
		int ans = -1;
		int low = 203/2, high = 203;
		
		while (low <= high) {
			
			int mid = low + (high - low) / 2;
			
			if (isvalid(arr, BOOKS, mid)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}
}