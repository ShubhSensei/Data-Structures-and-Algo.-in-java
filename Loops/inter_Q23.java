package Assignments.Loops;
import java.util.*;

public class inter_Q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Perfect number : ");
        int pf = in.nextInt();
        int sum = 0;
        for (int i = 1; i<pf; i++){
            if(pf%i==0){
                sum = sum +i;
            }
        }
        if(sum==pf){
            System.out.println("yes");
        } else{
            System.out.println("No");
        }
        in.close();
    }
}
