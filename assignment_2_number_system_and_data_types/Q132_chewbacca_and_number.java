package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class Q132_chewbacca_and_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		long x = kc.nextLong();
		long sum = 0;
		long mul = 1;
		long t1=0;
		long x1=x;
		long count=0;
		while(x1!=0) {
			count++;
			x1=x1/10;
		}
		long i=1;
		long rem1=0;
		long num1=0;
		long x2=x;
		while(i<=count-1) {
			rem1=x2/10;
			x2=x2/10;
			i++;
		}
		if (rem1==9) {
			long j=1;
			long sum1=sum;
			long mul1=mul;
			while(j<=count) {
				long t=x%10;
				t1=9-t;
				if(t1<t) {
					t=t1;
				}
				sum1=sum1+t*mul1;
				x=x/10;
				mul1=mul1*10;
				j++;
			}
			sum1=(long)(sum1+9*Math.pow(10, count-1));
			System.out.println(sum1);
		}
		else {
			while(x!=0) {
				long t=x%10;
				t1=9-t;
				if(t1<t) {
					t=t1;
				}
				sum=sum+t*mul;
				x=x/10;
				mul=mul*10;
			}
			System.out.println(sum);
		}
		

	}

}
