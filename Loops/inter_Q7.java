package Assignments.Loops;
import java.util.*;

public class inter_Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        System.out.print("Enter the power : ");
        int p = in.nextInt();
        int temp = 1;
        if (p>0){
           for (int i = 0; i<p; i++){
                temp = temp*n;
           } 
           System.out.println(temp);      
         }else if(p==0){
             int power = 1;
             System.out.println(power);
         } else if(p<0){
            for (int i = 0; i>p; i--){
                temp = temp*n;
           }  
            System.out.println("1/"+temp);
         }
        in.close();
    }
}
