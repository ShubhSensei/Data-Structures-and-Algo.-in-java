package Assignments.Sorting;
// import java.util.*;
import java.util.ArrayList;

// https://leetcode.com/problems/intersection-of-two-arrays/
public class E_05 {
    public static void main(String[] args) {            // Have to work on this
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2, 2};
        ArrayList <Integer> ans = intersection(nums1, nums2);
        System.out.println(ans);
    }
    static ArrayList<Integer> intersection(int[] nums1, int[] nums2) {
        // Swapping first Array
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length-1-i; j++) {
                // where is the if condition
                int temp = nums1[j];
                nums1[j] = nums1[j+1];
                nums1[j+1] = temp;
            }
        }
        // Swapping Second Array
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2.length-1-i; j++) {
                int temp = nums2[j];
                nums2[j] = nums2[j+1];
                nums2[j+1] = temp;
            }
        }
        ArrayList <Integer> ans = new ArrayList<>(1);
        for (int k = 0; k < nums1.length; k++) { //     {1, 1, 2, 2}
        int a = 0;
           while(a<nums2.length) { //     {2, 2}
                if(nums1[k] == nums2[a]){
                    if(k >=1 && nums1[k] == nums1[k-1]){
                        a++;
                    } else{
                        ans.add(nums1[k]);
                        a++;
                    }
                }
            }
        }
        return ans;
    }
}
