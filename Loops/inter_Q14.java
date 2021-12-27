package Assignments.Loops;
import java.util.*;

public class inter_Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Sum Of N Numbers
        System.out.println("Enter the numbers Rsp : ");
        int sum = 0;
        while(true){
            int n = in.nextInt();
            if(n==0){
                break;
            }
            sum+=n;
        }
        System.out.println("The sum of N numbers : "+sum);
        in.close();
    }
}
