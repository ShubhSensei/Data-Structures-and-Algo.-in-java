package Assignments.Arrays;
import java.util.Arrays;

// https://leetcode.com/problems/shuffle-the-array/
public class E_5 {
    public static void main(String[] args) { 
        int n = 3;
        int[] nums = {2,5,1,3,4,7};
        int[] arr = new int[n*2];
        int count = 1;
        int[] num1 = new int[n];
        int[] num2 = new int[n];
        for (int index = 0; index <n; index++) {
            num1[index] = nums[index];
        }
        for (int i = 0; i <nums.length/2; i++) {
            num2[i] = nums[n];
            n+=1; 
        }
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        for (int j = 0; j <arr.length; j++) {
            if(j%2==0){
                arr[j] = num1[j/2];
                // break;
            } else{
                arr[j] = num2[j-count];
                count+=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
