package assignment_3_arrays;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		while(loop >= 1){
			int size1 = sc.nextInt();
			int size2 = sc.nextInt();
			int [] a = new int[size1];
			int [] b = new int[size2];
			
			for(int i=0; i<a.length; i++) {
				a[i]= sc.nextInt(); 
			}
			
			for(int i=0; i<b.length; i++) {
				b[i]= sc.nextInt(); 
			}
			System.out.print(maxPathSum(a,b));
			loop--;
		}
	}
	
	public static int maxPathSum(int[] a, int[] b) {
		int sum1 = 0, sum2 = 0, result = 0;
		int sizea = a.length, sizeb = b.length;
		int i = 0, j = 0;
		
		while(i < sizea && j < sizeb) {
			if(a[i] > b[j]) {
				sum2 += b[j];//System.out.println("Sum2 "+sum2);
				j++; //System.out.println("j "+j);
			}
			else if(b[j] > a[i]) {
				sum1 += a[i];//System.out.println("Sum1 "+sum1);
				i++; //System.out.println("i "+i);
			}
			else {
				result += Math.max(sum1, sum2) + a[i];
				//System.out.println("result "+result);
				sum1 = 0;
				sum2 = 0;
				i++;j++;
			}
		}
		
		while(i < sizea) {
			sum1 += a[i];
			i++;
		}
		
		while(j < sizeb) {
			sum2 += b[j];
			j++;
		}
		
		result += Math.max(sum1, sum2);
				
		return result;
	}
}