package assignment_4_2D_arrays;

import java.util.*;
public class Q1365_Book_Allocation_Problem {
    public static void main(String args[]) {
        Scanner sr  =new Scanner(System.in);
  int t=sr.nextInt();
  int k=0;
  while(k<t){
    int n=sr.nextInt();
    int s=sr.nextInt();
    int [] a =new int[n];
    for(int i=0;i<n;i++){
        a[i]=sr.nextInt();
                        }
    minpage(a,s);
      k++;
         }
           }
   public static void minpage(int [] a ,int s){
    int lo=a[a.length-1];
    int hi=0;
    for(int i=0;i<a.length;i++){
        hi+=a[i];
    }
    // System.out.println(hi);
    int ans=0;
    int res=0;
    while(lo<=hi){
        int mid = lo + (hi - lo) / 2;
        if(isitpossible(a,mid,s)==true){
            ans=mid;
             hi=mid-1;
            // break;
        }
        else{
             lo=mid+1;
        }
    }
System.out.println(ans);
   }
    public static boolean isitpossible(int[] a, int mid ,int s){
   int s1=1;
   int red=0;
   for(int i=0;i<a.length;){
       if(red+a[i]<=mid){
           red+=a[i];
           i++;
       }
       else{
           red=0;
           s1++;
       }
   }
if(s1>s){
    return false;
}
return true;
    }
}
