package Assignments.Arrays;
import java.util.Arrays;
import java.util.*;
//  https://leetcode.com/problems/running-sum-of-1d-array/
public class E_3 {
    public static void main(String[] args) { //Running Sum of 1d Array
        Scanner in = new Scanner(System.in);
         int[] arr = {1, 2, 3, 4, 5};
         int[] sum = new int[(arr.length)];
         int temp = 0;
         for (int j = 0; j < arr.length; j++) {
            sum[j] = temp+ arr[j];
            temp = sum[j];
         }
        System.out.println(Arrays.toString(sum));
        in.close();
    }
}
