package Assignments.Loops;
import java.util.*;

public class inter_Q1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Factorial number - ");
        int n = in.nextInt();
        int b = 1;
        int fact = 1;
        while (b<=n){
            fact = fact*b;
            b++;
        }
        System.out.println(fact);
        in.close();
    }
}
