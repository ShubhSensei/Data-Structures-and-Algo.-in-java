package Assignments.Arrays;
// https://leetcode.com/problems/matrix-diagonal-sum/
public class E_15 {
    public static void main(String[] args) {
        int[][] mat = {
           {5},
           {4}
        };
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i==j){
                    sum+=mat[j][j];
                }
            }
        }
        
        int start = 0;
        int end = mat[start].length -1;
        for (int i = 0; i < mat.length; i++) {
            sum+=mat[start][end];
            if(start==end){
                sum-=mat[start][end];
            }
            start++;
            end--;
        }
        System.out.println(sum);
    }
}