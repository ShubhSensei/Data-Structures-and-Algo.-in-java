package Assignments.Sorting;
 import java.util.*;
// https://leetcode.com/problems/missing-number/
public class Missing_number {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int n = 3;
      //  int[] correct = new int[n+1];   
        cyclesort(arr, n);
        
        System.out.println(Arrays.toString(arr));
    }
    static void cyclesort(int[] arr, int n){
        int i = 0;
        while(i<arr.length) {
            int index = arr[i];
            if(arr[i] == index){
                i++;
                index = arr[i];
            }
            if(arr[i]!= arr[index]){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
    }
}
