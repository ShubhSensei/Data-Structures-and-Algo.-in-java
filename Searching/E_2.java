package Assignments.Searching;
// https://leetcode.com/problems/num-number-higher-or-lower/
// import java.util.*;
public class E_2 {
    public static void main(String[] args) {  // The Q. has an inbuild API so it can only be solved on LeetCode
        /** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */
       guess(8);
    }
    static int guess(int n){
        int start = 0;
        int end = n;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(guess(mid) == -1){
                end = mid-1;
            } else if(guess(mid)==1){
                start = mid+1;
            } else{
                return mid;
            }
        }
        return 0;
    }
}
