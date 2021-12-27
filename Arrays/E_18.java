// package Assignments.Arrays;
// // https://leetcode.com/problems/add-to-array-form-of-integer/
// import java.util.*;
// public class E_18 {
//     public static void main(String[] args) {
//         int[] num = {2,1,5};
//         int n = num.length;
//         int k = 806;
//         int temp = 0;
//         List<Integer> out = new ArrayList();
//         for (int i = 0; i < num.length; i++) {
//             temp = temp*10 + num[i];
//         }
//         while (--n >= 0 || k > 0){
//             if (n >= 0)
//                 k = k+temp;
//             out.add(k % 10);
//             k /= 10;
//         }
//         Collections.reverse(out);
//         System.out.println(out);
//     }
// }
