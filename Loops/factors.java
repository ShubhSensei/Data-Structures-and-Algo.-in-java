package Assignments.Loops;
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {

        /*Input a number and print all the
         factors of that number (use loops)
    */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = 1;
        while(fact<=n){
            if (n%fact==0){
                 System.out.println(fact);
            }
            fact=fact+1;
        }

     
       in.close();
    }
}
