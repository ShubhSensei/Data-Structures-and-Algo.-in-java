package Assignments.Searching;
import java.util.*;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class M_1 {
    public static void main(String[] args) { // didn't solved yet but it is simple, solve it again by binary search
        int[] nums = {5,7,7,8,8,10};
        int start = 0;
        int end = 0;
        int target = 6;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                start = i;
                break;
            } else{
                start = -1;
            }
        }
        for (int j = nums.length-1; j >= 0; j--) {
            if(nums[j]==target){
                end = j;
                break;
            } else{
                end = -1;
            }
        }
        int[] ans = {start, end};
        System.out.println(Arrays.toString(ans));
    }
}
