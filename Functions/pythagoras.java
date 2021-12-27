package Assignments.Functions;
import java.util.*;
public class pythagoras {
    public static void main(String[] args) {
        /*Write a function to check if a given triplet is a Pythagorean triplet or not.
        (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
        */ 
        pytha();
    }
    static void pytha(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the largest side : ");
        int a = in.nextInt();
        System.out.print("Enter the other 2 sides: ");
        int b = in.nextInt();
        int c = in.nextInt();
        int temp = a*a;
        int count = (b*b +c*c);
        
        if(temp==count){
            System.out.println("Yes, these r Pythagorean triplet ");
        } else{ 
            if(a<b || a<c){
                System.out.println(a+" is not the largest side which you just mentioned");
            }
            System.out.println("No, these r nt Pythagorean triplet ");
        }
        in.close();
    }
}
