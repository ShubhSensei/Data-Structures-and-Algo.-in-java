package Assignments.Patterns;

public class Q28 {
    public static void main(String[] args) {
        q(5);
    }
    static void q(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
            int noofspaces = n - row;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }
            if(row==n){
                for (int s = 1; s <=row ; s++) {
                    for (int j = s; j < row; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    for (int cs = noofspaces; cs > 0; cs--) {
                        System.out.print(" ");
                    }
                 }
                 break;
            }
        } 
    }   
    
}
