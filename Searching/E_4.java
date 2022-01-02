package Assignments.Searching;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class E_4 {
    public static void main(String[] args) {
        int[] nums = {2,3,4}; // Y h Aam Zindagi
        int target = 6;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int count = nums[i]+nums[j];
                if(count==target){
                    System.out.println("["+ (i+1) + ","+ (j+1)+"]");
                }
            }
        }  
        // y h Mentos Zindagi // Binary Search

        // int i = 0;
        // int j = nums.length-1;
        // while(i<j){
        //     if(nums[i]+nums[j]>target){
        //         j--;
        //     } else if(nums[i]+nums[j]<target){
        //         i++;
        //     } else{
        //         int[] out = {i+1, j+1}; 
        //         System.out.print(Arrays.toString(out));  // In Functions write this line as : return new int[]{l+1,h+1};
        //     }
        // }
        // System.out.println("[]"); // and this line as return new int[]{};
    }
}
