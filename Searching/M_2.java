package Assignments.Searching;
// https://leetcode.com/problems/single-element-in-a-sorted-array/
public class M_2 {              // Binary Search s bhi ho sakta h so just think hard
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }
    static int singleNonDuplicate(int[] nums) {
        int s = 0; int e = nums.length-1;
        if(s==e){
            return nums[s];
        } 
        while(s<=e){
            if(nums[s] == nums[s+1] && nums[e] == nums[e-1]){
                s = s+2; e = e-2; 
            } else if(nums[s] != nums[s+1]){
                return nums[s];
            } else {
                return nums[e];
            }
        }
        return nums[s];
    }
                                           // Linear Search 
    static int LinearSearch(int[] nums) {
        //traverse through arrau and check if prev is equal to curr ,if not return prev
            for(int i=1;i<nums.length;i+=2){
             if(nums[i]!=nums[i-1]){
                 return nums[i-1];
             }   
            }
            //if didn't find means last element is single, here's the example [1,1,2,2,3]
            return nums[nums.length-1];
        }
}