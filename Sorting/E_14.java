package Assignments.Sorting;
import java.util.*;
// https://leetcode.com/problems/squares-of-a-sorted-array/
public class E_14 {
    public static void main(String[] args) {
    int[] nums = {-4,-1,0,3,10};
    int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            // nums[i] = nums[i] * nums[i];
            for (int j = 0; j < nums.length-1; j++) {
                
                // if(nums[i] <0){
                //     nums[i] = nums[i]*-1;
                // }
               
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    } 
}
