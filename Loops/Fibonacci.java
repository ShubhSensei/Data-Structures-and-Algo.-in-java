package Assignments.Loops;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a, b, n, count;
        n = in.nextInt();
        a = 0;
        b = 1;
        count = 2;
        while(count<=n){
            int temp = b;
            b = b+a;
            count++;
            a = temp;
        }
        System.out.println(b);
        in.close();
    }
}
