package Assignments.Arrays;

public class M_10 {
    public static void main(String[] args) {
        int[]  nums = {1, 2, 1, 1};
        int ans = rob(nums);
        System.out.println(ans);
    }
    static int rob(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i = i+2) {
            count1 = count1 + nums[i];
        }
        for (int i = 1; i < nums.length; i = i+2) {
            count2 = count2 + nums[i];
        }
        return Math.max(count1, count2);
    }
}
