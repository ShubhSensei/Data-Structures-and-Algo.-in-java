//https://leetcode.com/problems/flipping-an-image/
package Assignments.Arrays;
// import java.util.*;
public class E_13 {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        int[][] result = new int[3][3];

        for (int i = 0; i < image.length; i++) {
            for (int k = image[i].length -1; k>=0; k--) {
                int j = 0;
                result[i][j] = image[i][k];
                j++;
            }
        } 

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if(result[i][j] ==0){
                    result[i][j] = 1;
                } if(result[i][j] ==1) {
                    result[i][j] = 0;
                }
            }
        }
        // System.out.println(result);
        // for (int[] is : result) {
        //     System.out.println(Arrays.toString(is));
        // }
    }
}
