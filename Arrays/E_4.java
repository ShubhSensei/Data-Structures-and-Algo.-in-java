package Assignments.Arrays;
// https://leetcode.com/problems/richest-customer-wealth/
public class E_4 {
    public static void main(String[] args) { //Richest Customer Wealth
        int[][] accounts = {
            {1, 2, 5},
            {1, 2 ,2}
        };
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp = temp+ accounts[i][j];
                if(temp>sum){
                    sum = temp;
                 } else{
                    continue;
                }
            }
        }
        System.out.println(sum);
    }
}
