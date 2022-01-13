package Assignments.Searching;
// https://leetcode.com/problems/find-peak-element/
public class M_6 {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,5,6,4};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }
    static int findPeakElement(int[] nums) {
        int peak = Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            peak = Math.max(peak, nums[i]);
        }
        return peak;
    }
}
