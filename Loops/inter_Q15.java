package Assignments.Loops;
import java.util.*;
public class inter_Q15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum+ rem*rem*rem;
            n = n/10; 
        }
        if(sum==original){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
        in.close();
    }
}
