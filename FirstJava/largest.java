package Assignments.FirstJava;
import java.util.*;

public class largest { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        if (a>b){
            System.out.println(a + " is larger than " + b);
        } else if (b>a){
            System.out.println(b + " is larger than " + a);
        } else{
            System.out.println("Invalid");
        }
        in.close();
    }
}