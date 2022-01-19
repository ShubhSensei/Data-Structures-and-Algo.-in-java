package Assignments.Sorting;
// import java.util.*;
// https://leetcode.com/problems/contains-duplicate/
public class E_03 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 6, 8, 4, 4, 5};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
    static boolean containsDuplicate(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]) {
                return true;
            }
        }
        return false;
    }
    static int sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return 0;
    }
}
