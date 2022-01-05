package Assignments.Sorting;
import java.util.*;
public class Cyclic_Sort_Trial {
    public static void main(String[] args) {
        int arr[] = {4, 0, 2, 1, 3}; 
        int i = 0;
        while(i<arr.length) {
            int index = arr[i] ;  // value = arr[i] //correct index
            if(arr[i]!= arr[index]){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
} 