package Assignments.Patterns;

public class Q26 {
    public static void main(String[] args) {
        /*
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
        */
        q(6);
    }
    static void q(int n){
        for (int row = 1; row <=n; row++) {
            for (int i = 1; i <= n-row +1; i++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
