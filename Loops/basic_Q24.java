package Assignments.Loops;
import java.util.*;

public class basic_Q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        double sum = 0;
        System.out.println("Enter the numbers rsp. : ");
        while (true){
            int num = in.nextInt();
            if (num==0){
                break;
            }
            sum+=num;
        }
        System.out.println(sum);
        in.close();
    }
}
