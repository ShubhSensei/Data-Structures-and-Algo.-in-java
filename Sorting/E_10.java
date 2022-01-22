package Assignments.Sorting;
// https://leetcode.com/problems/maximum-product-of-three-numbers/
public class E_10 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        int ans  =maximumProduct(nums);
        System.out.println(ans);
    }
    static int maximumProduct(int[] nums) {
        int multiply = 1;
        if(nums.length <=2){
            for (int i = 0; i < nums.length; i++) {
                multiply = multiply * nums[i];
            }
            return multiply;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int e = nums.length-1; e >= nums.length-3; e--) {
            multiply = multiply * nums[e];
        }
        return multiply;
    }
}
