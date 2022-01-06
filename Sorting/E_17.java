package Assignments.Sorting;
// https://leetcode.com/problems/binary-search/
public class E_17 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int ans = binarysearh(nums, target);
        System.out.println(ans);
    }
    
    static int binarysearh(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int middle = (end+start)/2;
            if(target < nums[middle]){
                 end = middle-1;
            } else if ( target> nums[middle]) {
                start = middle+1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
