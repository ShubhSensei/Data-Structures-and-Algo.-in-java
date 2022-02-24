package Assignments.Arrays;
import java.util.*;
public class H_01 {
    public static void main(String[] args) {    // Time limit exceeded
        int[][] points = {
            // {1, 3},
            // {2, 0},
            // {5, 10},
            // {6, -10},
            {0, 0}, {3, 0}, {9, 2},
        };
        int k = 3;
        int ans = findMaxValueOfEquation(points, k);
        System.out.println(ans);
    }
    static int findMaxValueOfEquation(int[][] points, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < points.length-1; i++) {
            for (int j = i+1; j < points.length; j++) {
                int satisfy = points[i][0] - points[j][0];
                if(satisfy < 0){ satisfy = satisfy *-1;}
                
                if(satisfy <= k){
                    int maxans = points[i][1] + points[j][1] + satisfy;
                    list.add(maxans);
                }
            }
        }
        return Collections.max(list);
    }
}
