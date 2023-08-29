package assignment_3_arrays;

import java.util.*;
public class Q1075_Next_Permutation {
    
	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {

		int t = scn.nextInt();
		while ((t--) > 0) {

			int n = scn.nextInt();
			int[] arr = takeInput(n);

			next_permutation(arr);
			display(arr);

		}
	}

	public static int[] takeInput(int n) {

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();

		return arr;

	}

	public static void next_permutation(int[] nums) {

		if (nums == null || nums.length < 2)
			return;

		int p = 0;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				p = i;
				break;
			}
		}

		int q = 0;
		for (int i = nums.length - 1; i > p; i--) {
			if (nums[i] > nums[p]) {
				q = i;
				break;
			}
		}

		if (p == 0 && q == 0) {
			reverse(nums, 0, nums.length - 1);
			return;
		}

		int temp = nums[p];
		nums[p] = nums[q];
		nums[q] = temp;

		if (p < nums.length - 1) {
			reverse(nums, p + 1, nums.length - 1);
		}
	}

	public static void reverse(int[] nums, int left, int right) {
		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}

	public static void display(int[] arr) {

		for (int val=0;val<arr.length;val++) {
			System.out.print(arr[val] + " ");
		}

		System.out.println();
	}

    
}