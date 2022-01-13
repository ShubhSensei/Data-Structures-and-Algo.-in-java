package Assignments.Searching;
// https://leetcode.com/problems/find-peak-element/
public class M_6 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int ans =  findPeakElement(nums);
        System.out.println(ans);
        

    }
    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            if(nums[start] <= nums[end]){
                start++;
            } else{
                end--;
            }
        }
        return start-1;
    }
}
