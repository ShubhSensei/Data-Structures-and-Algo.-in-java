package Assignments.Patterns;

public class Q21 {
    public static void main(String[] args) {
        /*
       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
        */
        q(5);
    }
    static void q(int n){
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= row; i++) {
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
        }
    }
}
