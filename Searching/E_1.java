package Assignments.Searching;
// https://leetcode.com/problems/sqrtx/
public class E_1 {
    public static void main(String[] args) {
        sqrt(4);
    }
    static int sqrt(int x){
        int start = 0;
        int end = (int)(x/2);
        for (int i = 0; i <= end; i++) {
            int mid = (int)(start+end)/2;
            if(mid*mid==x){
                System.out.println(mid);
                break;
            } else if((mid+1)*(mid+1) == x){
                System.out.println(mid+1);
                break;
            }
            if(mid*mid < x && (mid+1)*(mid+1) > x){
                System.out.println(mid);
                break;
            } else if(mid*mid < x && (mid+1)*(mid+1) < x){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
        
    }
    //                                                           2nd Method
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 0, right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1; 
            } else {
                left = mid + 1;
                if (left > x / left) {
                    return mid;
                }                
            }
        }
        
        return left;
    }
}
