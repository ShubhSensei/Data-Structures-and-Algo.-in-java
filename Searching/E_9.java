package Assignments.Searching;
// https://leetcode.com/problems/search-insert-position/
public class E_9 {
    public static void main(String[] args) {
        int[] nums = {1,3, 5, 6};
        int ans = insert(nums, 0);
        System.out.println(ans);
    }
    static int insert(int[] nums, int target){
       for (int i = 0; i < nums.length; i++) {
           if(nums[i]==target){
               return i;
           }
       }
       int i = 0;
       while(i<nums.length-1) {
           if(nums[0] > target ){
               return -1;
           }
           if(nums[i] <target && nums[i+1] > target ){
               return i+1;
           } else{
               i++;
           }
       }
       return 0;
    }
}
