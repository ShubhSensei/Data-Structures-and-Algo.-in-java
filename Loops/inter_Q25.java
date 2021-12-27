package Assignments.Loops;
import java.util.*;

public class inter_Q25 {
    public static void main(String[] args) { //Sum Of A Digits Of Number
        Scanner in = new Scanner(System.in);
        System.out.print("ENter the number : ");
        int n = in.nextInt();
        int sum = 0;
        while(n>0){
            int temp = n%10;
            sum = sum+temp;
            n=n/10;
        }
        System.out.println("Sum Of A Digits Of Number --> "+sum);
        in.close();
    }
}
