package Assignments.Sorting;
import java.util.*;
// https://leetcode.com/problems/third-maximum-number/
public class E_07 {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
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
        if(nums.length <=2){
            return nums[nums.length-1];
        }
        return nums[nums.length-3];
    }
}
