package Assignments.Patterns;

public class Q3 {
    public static void main(String[] args) {
        /* 
    *****
    ****
    ***
    **
    * 
*/
        q(5);
    }
    static void q(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
