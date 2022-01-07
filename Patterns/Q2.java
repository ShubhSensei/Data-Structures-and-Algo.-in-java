package Assignments.Patterns;

public class Q2 {
public static void main(String[] args) { 
    /* print 
    *
    **
    ***
    ****
    *****
    */ 
        q(5);
    }
    static void q(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
