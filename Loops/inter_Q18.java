package Assignments.Loops;
import java.util.Scanner;

public class inter_Q18{
    public static void main(String[] args) {
        //Find if a number is palindrome or not
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the number to check if it is palindrome or not : ");
        int n = in.nextInt();
        int palindrome = 0;
        while(n>0){
            int rem = n%10;
            palindrome = palindrome*10 +rem;
        }
        if (palindrome == n){
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
        in.close();
    }
}
