package Assignments.Functions;
import java.util.*;

public class even_odd {
    public static void main(String[] args) { //Define a program to find out whether a given number is even or odd.
        check();
    }
    static void check(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check if it's even or odd : ");
        int n= in.nextInt();
        if(n%2==0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
        in.close();
    }
}
