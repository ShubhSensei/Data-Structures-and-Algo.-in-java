package Assignments.Patterns;

public class Q6 {
    public static void main(String[] args) {
        /*
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
                int noofSpaces = n - row;
            for (int i = 0; i < noofSpaces; i++) {
                System.out.print(" ");
            }
                System.out.print("*");
            }
             System.out.println();
        } 
     }   
}
