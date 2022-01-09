package Assignments.Searching;
// import java.util.*;
// https://leetcode.com/problems/valid-perfect-square/
public class E_5 {
    public static void main(String[] args) { 
       boolean ans =  isPerfectSquare(15);
       System.out.println(ans);
    }
    static boolean isPerfectSquare(int num) {
          int low=1; int high=num;long mid=-1;
    while(low<=high){
         mid = low +(high-low)/2;
        if(mid*mid==num){
            return true;
        }
       else if(mid*mid>num){
            high=(int)mid-1;
        }
        else{
            low=(int)mid+1;
        }
    }
    return false;

    }
}
