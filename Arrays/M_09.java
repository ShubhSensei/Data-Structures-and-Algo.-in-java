package Assignments.Arrays;

import java.util.Arrays;

public class M_09 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
