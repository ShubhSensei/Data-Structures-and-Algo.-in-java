package Assignments.Arrays;
// https://leetcode.com/problems/two-sum/
public class E_21 {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    System.out.println(i + ", "+j);
                }
            }
        }
    }
}
