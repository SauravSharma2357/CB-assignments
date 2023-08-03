package assignment_2_number_system_and_data_types;

import java.util.Scanner;

public class question_16_conversion_any_to_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc =new Scanner(System.in);
		int SB= kc.nextInt();
		int DB = kc.nextInt();
		int SN = kc.nextInt();
		int rem=0;
		int mul1=1;
		int sum=0;
		if(SB==10 || DB==10) {
			int SN1=SN;
			while(SN1!=0) {
				rem=SN1%DB;
				sum=sum+rem*mul1;
				mul1=mul1*SB;
				SN1=SN1/DB;
			}
			System.out.println(sum);
		}
		else {
			int SN2=SN;
			int mul2=1;
			int rem1=0;
			int sum2=0;
			while(SN2!=0) {
				rem1=SN2%10;
				sum2=sum2+rem1*mul2;
				mul2=mul2*SB;
				SN2=SN2/10;
			}
			int SN3=sum2;
			int sum3=0;
			int mul3=1;
			while(SN3!=0) {
				rem=SN3%DB;
				sum3=sum3+rem*mul3;
				mul3=mul3*10;
				SN3=SN3/DB;
			}
			System.out.println(sum3);
			
			
		}
	}
}
