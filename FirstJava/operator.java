package Assignments.FirstJava;
import java.util.*;

public class operator { // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(" Choose from +, -, *, /  - ");
        String o = sc.next();

        // Conditions
        if (o=="+"){
            int sum = a+b;
            System.out.println(sum);
        }
        if (o=="-"){
            int sub = a-b;
            System.out.println(sub);
        }
        if (o=="*"){
            int mul = a*b;
            System.out.println(mul);
        }
        if (o=="/"){
            int div = a/b;
            System.out.println(div);
        } //else{
          //  System.out.print(" Aree Babu Choose from +, -, *, /  - ");
        //}

        sc.close();
    }
}
