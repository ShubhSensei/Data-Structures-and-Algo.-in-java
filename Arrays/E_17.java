package Assignments.Arrays;

// https://leetcode.com/problems/transpose-matrix/
public class E_17 {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6}
            // {7,8,9}
        };
        int[][] result = new int[mat[0].length][mat.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = mat[j][i];
                System.out.println(result[i][j]);
            }
        }
    }
}
