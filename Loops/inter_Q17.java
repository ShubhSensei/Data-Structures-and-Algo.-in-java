package Assignments.Loops;
import java.util.*;

public class inter_Q17 { // Reverse a String
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                // 1st METHOD
        String reverse = "";
        String original = in.nextLine();
        int length = original.length();
        for (int i = length-1; i>=0; i--){
            char ch = original.charAt(i);
            reverse = reverse +ch;
        }
        System.out.println(reverse);
        in.close();

        // Scanner in = new Scanner(System.in);
        // String original = in.nextLine();                  // 2nd Method
        // int length = original.length();
        // for (int i = length-1; i>=0; i--){
        //     char ch = original.charAt(i);
        //     System.out.print(ch);
        // }
        // System.out.println("2nd Method");
        // in.close();
    
    }
}
