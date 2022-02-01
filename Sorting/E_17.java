// package Assignments.Sorting;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// // https://leetcode.com/problems/minimum-absolute-difference/
// public class E_17 {
//    public static void main(String[] args) {
//        List<Integer> arr = {4, 2, 1, 3};
        
//    } 
//    static List<List<Integer>> minimumAbsDifference(int[] arr) {
//     Arrays.sort(arr);
//     List<List<Integer>> ans = new ArrayList<List<Integer>>();
//     int mindiff = arr[1] - arr[0];
//     for (int i = 0; i < arr.length-1; i++) {
//         if(arr[i+1] - arr[i] == mindiff){
//             ans.add(Arrays.asList(arr[i], arr[i + 1]));
//         }
//     }
//     return ans;
//   }
// }
