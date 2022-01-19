package Assignments.Sorting;

// https://leetcode.com/problems/missing-number/
public class E_04 {
    public static void main(String[] args) {        
         int[] nums = {9,6,4,2,3,5,7,0,1};
         int ans = missingNumber(nums);
         System.out.println(ans);
    }
    static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        int i = 0;
        while(i<nums.length){
            if(i == nums[i]){
                i++;
            } else{
                return i;
            }
        }
        return i;
    }
}
