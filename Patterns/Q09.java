package Assignments.Patterns;

public class Q09 {
    public static void main(String[] args) {
        q(5);
    }
    static void q(int n){
        for (int row = n; row > 0; row--) {
            for (int space = n-row; space >= 0; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (row*2)-1; col++) {
                System.out.print("*");
            } 
             System.out.println();
        } 
     }
}
