package Assignments.Sorting;
// import java.util.*;
// https://leetcode.com/problems/majority-element/
public class E_2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2};
        int majority = majorityElement(nums);
        
        System.out.println(majority);
    }
    static int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        int n = nums.length;
        int count = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                count++;
            } else{
                i++;
            }
            if (count > n/2) {
                return nums[i];
            } else {
                count = 1;
            }
        }
        return 0;
    }
}
