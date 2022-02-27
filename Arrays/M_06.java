package Assignments.Arrays;

import java.util.Arrays;

public class M_06 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        int start = -1; int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                start = i;
                break;
            }
        }
        for (int j = nums.length-1; j >=0; j--) {
            if(nums[j] == target){
                end = j;
                break;
            }
        }
        int[] ans = {start, end};
        return ans;
    }
}
