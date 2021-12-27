package Assignments.Arrays;
//  https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
import java.util.*;
public class E_8 {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i] && j!=i){
                    count+=1;
                }
             result[i] = count;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
