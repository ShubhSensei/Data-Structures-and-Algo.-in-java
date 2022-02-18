package Assignments.Patterns;

public class Q18 {
    public static void main(String[] args) {
        q(5);
    }
    static void q(int n){
        for (int row = n; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int space = (n-row)*2; space > 0; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            } 
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int space = (n-row)*2; space > 0; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            } 
            System.out.println();
        }
     }  
}
