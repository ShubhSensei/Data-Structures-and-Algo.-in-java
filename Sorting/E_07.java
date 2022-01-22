package Assignments.Sorting;
import java.util.*;
// https://leetcode.com/problems/third-maximum-number/
public class E_07 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 2}; // Test cases {1, 1, 2}, {5, 2, 2}
        int ans = thirdMax(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(ans);
    }
    static int thirdMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        if(nums.length <=2 ){
            return nums[nums.length-1];
        }
        int previous = Integer.MAX_VALUE;
        int count = 0;
        for (int end = nums.length-1; end >= 0; end--){
            if(nums[end]!=previous){
                previous = nums[end];
                count++;
            }

            if(count ==3){
                return previous;
            }
        }  
        if(count >0){
            return nums[nums.length-1];
        }
        return previous;
    }
}
