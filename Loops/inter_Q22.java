package Assignments.Loops;
import java.util.Scanner;

public class inter_Q22 {
    public static void main(String[] args) { // Java Program Vowel Or Consonant
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a word : ");
        char word = in.next().trim().charAt(0);
        if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u' || word == 'A' || word == 'E' || word == 'I' || word == 'O' || word == 'U' ){
            System.out.println(" Vowel ");
        } else{
            System.out.println(" Consonent ");
        }
        in.close();
    }
}
