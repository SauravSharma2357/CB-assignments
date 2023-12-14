package Test_1;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N= kc.nextInt();
		String[] arr = new String[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=kc.next();
		}
		Sort(arr);
	}
	public static void Sort(String[] arr) {
		int si=0;
		int ei=arr.length-1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] == "P") {
				String temp = arr[i];
				arr[i]=arr[si];
				arr[si]=temp;
				si++;
			}
			
			if(arr[i] == "M") {
				String temp = arr[i];
				arr[i]=arr[ei];
				arr[ei]=temp;
				ei--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
