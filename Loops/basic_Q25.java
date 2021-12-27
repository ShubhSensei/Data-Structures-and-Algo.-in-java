package Assignments.Loops;
import java.util.*;

public class basic_Q25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take integer inputs till the user enters 0 and print the largest number from all.
        int temp = 0;
        System.out.println("Numbers likh Bro : ");
        while (true){
            int n = in.nextInt();
            int c = Math.max(n,temp);
            temp = c;
            if (n==0){
                break;
            }
        }
        System.out.println("Largest number is : "+temp);
        in.close();
    }
}
