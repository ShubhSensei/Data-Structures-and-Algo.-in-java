package Assignments.Patterns;

public class Q35 {
    public static void main(String[] args) {
        q(4);
    }
    static void q(int n){
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <=row ; j++) {
                System.out.print(j);
            }
            for (int space = (n-row)*2; space >= 1 ; space--) {
                System.out.print(" ");
            }
            for (int i = row; i >=1; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
