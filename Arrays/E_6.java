package Assignments.Arrays;
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.*;
public class E_6 {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        String[] result = new String[candies.length];
        int temp = 0;
        for (int i = 0; i < candies.length; i++) {
            temp = Math.max(temp, candies[i]);
        }
        System.out.println(temp);
        for (int i = 0; i < candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
            if(candies[i]>=temp){
                 result[i] = "True";
            } else{
                result[i] = "False";
            }
        }        
        System.out.println(Arrays.toString(result));
     }
}
