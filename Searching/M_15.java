package Assignments.Searching;
import java.util.*;
// https://leetcode.com/problems/find-the-duplicate-number/
public class M_15 {
    public static void main(String[] args) {    // Runtime Error aa raha h LeetCode p
        int[] nums = {1,3,4,2,2};
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
    static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    return nums[j];
                }
            }
        }
        return -1;
    }
}
