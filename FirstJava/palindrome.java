package Assignments.FirstJava;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) { // if a string is palindrome or not
 
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a string to check if it is a palindrome - "); 
            String original = in.next();
            String reverse = "";
             
            int length = original.length(); 
            for (int i = length-1; i>=0; i--)
                reverse = reverse +original.charAt(i);
            if (original.equals(reverse)) 
                System.out.println("This is a Palindrome");
              else
                System.out.println("This is not a Palindrome");
    
            in.close();
          
    }
}
