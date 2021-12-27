package Assignments.Arrays;
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class E_23 {
    public static void main(String[] args) {
        int[][] matrix = {
            {3,7,8},
            {9,11,13},
            {15,16,17}
        };
        int row = Integer.MAX_VALUE;
        int col = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int j1 = 0; j1< matrix[i].length; j1++) {
                    row = Math.min(row, matrix[i][j1]);
                }
                for (int k = 0; k < matrix.length; k++) {
                    col = Math.max(col, matrix[k][i]);
                }
                if(row==col){
                    System.out.println(row+" is the lucky number");
                } else{
                    continue; 
                }
            }
        }
        System.out.println(col);
    }
}
