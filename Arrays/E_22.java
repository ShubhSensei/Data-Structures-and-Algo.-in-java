package Assignments.Arrays;
import java.util.*;
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class E_22 {
    public static void main(String[] args) {
         int n = 5;
    //     int[] num = new int[n];
    //     int sum = 0; 
    //     int min = -9; int max = 9;
    //     int temp = 1;
    //     for (int i = 0; i < 1; i++) {
    //         num[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
    //         temp = temp*num[i];
    //     }
    //     for (int i = 1; i < num.length; i++) {
    //         num[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
    //         temp+= num[i];
    //     }
    //     while(temp==sum){
    //         for (int i = 0; i < 1; i++) {
    //             num[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
    //             temp = temp*num[i];
    //         }
    //         for (int i = 1; i < num.length; i++) {
    //             num[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
    //             temp+= num[i];
    //         }
    //     }
    //     System.out.println(Arrays.toString(num));
    //     System.out.println(temp);

    int [] resultantArray = new int[n];
    int num = 1;      
    int start = 0;    
    int end = resultantArray.length-1;  
    while(start<end){  
        resultantArray[start] = num;     
                resultantArray[end] = (-num);   
                num++;   
                start++; 
                end--;    
            }
            System.out.println(Arrays.toString(resultantArray));
            
     }
}
