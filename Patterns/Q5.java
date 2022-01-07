package Assignments.Patterns;

public class Q5 {
    public static void main(String[] args) {
/*
    *
    **
    ***
    ****
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
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
            if(row==n){
                for (int i = 1; i <=row ; i++) {
                    for (int j = i; j < row; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                 }
                 break;
            }
        } 
    }   
}
