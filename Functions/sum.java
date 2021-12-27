package Assignments.Functions;
import java.util.*;
public class sum {
    public static void main(String[] args) {
        add(); // Write a program to print the sum of two numbers entered by user by defining your own method.
    }
    static void add(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers resp. : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Sum of two No. is  "+sum);
        in.close();
    }
}
