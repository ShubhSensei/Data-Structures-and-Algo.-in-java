package Assignments.Searching;
// https://leetcode.com/problems/arranging-coins/
import java.util.*;
public class E_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total no. of coins : ");
        int n = in.nextInt(); // total no. of coins
        int row = 1; // no. of complete rows
        for (int i = 0; i < n; i++) {
            n-=row;
            row++;
            if(row>n){
                break;
            }
        }
        System.out.println(row-1);
        in.close();
    } 
}
