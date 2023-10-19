package assignment_6_recursion_and_back_tracking;

	import java.util.*;
	
	public class Q394_Dictionary_Order_Larger {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner kc = new Scanner(System.in);
			String ques = kc.next();
			char[] arr = ques.toCharArray();
			Arrays.sort(arr);
			String str = new String(arr);
			Permutations(str,"",ques);
		}
		public static void Permutations(String ques,String ans, String O) {
			if(ques.length()==0) {
				for(int j=0;j<ans.length();j++) {
					if(O.charAt(j)<ans.charAt(j)) {
						System.out.println(ans);
						return;
					}
					else if(O.charAt(j)>ans.charAt(j)) {
						return;
					}
				}
				return;
			}
			for(int i=0;i<ques.length();i++) {
				String s1 = ques.substring(0, i);				
				String s2 = ques.substring(i+1);
				char ch = ques.charAt(i);
				Permutations(s1+s2,ans+ch,O);
			}
		}
	
	}
