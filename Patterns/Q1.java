package Assignments.Patterns;

public class Q1 {
    public static void main(String[] args) {
        q(5); 
    }
    static void q(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}