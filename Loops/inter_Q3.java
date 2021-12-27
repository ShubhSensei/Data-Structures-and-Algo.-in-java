package Assignments.Loops;
import java.util.*;

public class inter_Q3 {
    public static void main(String[] args) {
        // WAP to Calculate Average Of N Numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Elements - ");
        int n = in.nextInt();
        double sum = 0;
        System.out.println("Now, Enter the "+n+" numbers respectively :");
        for (int i = 0; i<n; i++){
            double num = in.nextDouble();
            sum = sum+num;
        }
        double average = sum/n;
        System.out.println("Average is : "+average);
        in.close();
    }
}
