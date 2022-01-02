package Assignments.Searching;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class E_7 {
    public static void main(String[] args) { // Binary search
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        int start = 0;
        int end =  (letters.length)-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
       System.out.println(letters[start%letters.length]);
    }
}
