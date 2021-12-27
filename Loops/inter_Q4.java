package Assignments.Loops;
import java.util.*;

public class inter_Q4 {
    public static void main(String[] args) {
      //Calculate Discount Of Product
    /* Discount ? 
        MRP = user 
       price of the product = user 
    */
    while (true){
        Scanner in = new Scanner(System.in);   
        System.out.print("Actual price : ");
        float m = in.nextInt(); // MRP
        System.out.print("Tunee kitne m khareeda, vo bata 😂: ");
        float ap = in.nextInt();
        float diff = m -ap;
        double discount = (diff/m) *100;
        System.out.println("Discount is : "+ discount + "%");
        in.close();
    }
    }
}
