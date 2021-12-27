package Assignments.Arrays;
// import java.util.*;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class E_16 {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        int result = 0;
        int digit = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            digit = nums[i];
            while(digit>0){
                digit = digit/10;
                count++;
            }
            if(count%2==0){
                result++;
            }
        }
        System.out.println(result);
        
    }
}
