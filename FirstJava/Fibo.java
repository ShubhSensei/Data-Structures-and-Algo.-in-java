package Assignments.FirstJava;
import java.util.*;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1; 
        int n = in.nextInt();
        int count = 2;
        while (count<=n){
            int temp = b;
            b = b+a;
            count++;
            a=temp;
        }
        System.out.println(b);
        in.close();
    }
}
