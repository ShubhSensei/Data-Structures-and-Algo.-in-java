package Assignments.Sorting;
// https://leetcode.com/problems/height-checker/
public class E_15 {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int ans = heightChecker(heights);
        System.out.println(ans);
    }
    static int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j <expected.length-1-i; j++) {
                if(expected[j] > expected[j+1]){
                    int temp = expected[j];
                    expected[j] = expected[j+1];
                    expected[j+1] = temp;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < expected.length; i++) {
            if(heights[i] != expected[i]){
                count = count +1;
            }
        }
        return count;  
    }
}
