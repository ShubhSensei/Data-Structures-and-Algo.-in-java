package Assignments.Arrays;
import java.util.*;
// https://leetcode.com/problems/concatenation-of-array/
public class E_2{
   public static void main(String[] args) { //Concatenation of Array
        Scanner in = new Scanner(System.in);
        // int [] nums = new int[3];
        // for (int i = 0; i< nums.length; i++){
        //     nums[i] = in.nextInt();
        // }
        // int len = nums.length;
        // int concat1 = len +len; 
        // int[] concat = new int[concat1];
        // System.arraycopy(nums, 0, concat, 0, len);
        // System.arraycopy(nums, 0, concat, len, len);
        // System.out.println(Arrays.toString(concat));
        
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
        in.close();
   }
    static int[] getConcatenation(int[] nums) {
        
        int arr[] = new int[(nums.length * 2)];
        for(int i = 0; i < nums.length; i++){
            //first half of output array
            arr[i] = nums[i];
            //second half of output array
            arr[i + nums.length] = nums[i];
        }
        return arr;
        
    }
}
