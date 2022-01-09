// package Assignments.Searching;

// public class E_3 {
//     public static void main(String[] args) {
//         // // The Q. has an inbuild API so it can only be solved on LeetCode

//     }
//     static boolean isBadVersion(){
//         /* The isBadVersion API is defined in the parent class VersionControl.
//       boolean isBadVersion(int version); */
//     }
//     static int firstBadVersion(int n) {
//         int start = 1;
//         int end = n;
//         while(start<=end){
//             int mid = start+(end-start)/2;
//             if(isBadVersion(mid)=="false"){
//                 start = mid+1;
//             } else{
//                 end = mid-1;
//             }
//         }
//         return 0;
//     }
// }
