package assignment_3_arrays;

import java.util.*;
public class test {
    public static void main(String args[]) {
        Scanner kc = new Scanner(System.in);
        int N = kc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<arr.length;i++){
            arr[i] = kc.nextInt();
        }
        Inverse(arr,N);
        
    }
    public static void Inverse(int[] arr, int N){
        int[] arr1 = new int[N];
        for(int i=0;i<arr1.length;i++){
            arr1[arr[i]]=i;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}