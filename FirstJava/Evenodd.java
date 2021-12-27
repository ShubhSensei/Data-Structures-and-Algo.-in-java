package Assignments.FirstJava;
import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println(" Even Number ");
        } else{
            System.out.print(" Odd Number ");
        }
        sc.close();
    }
}
