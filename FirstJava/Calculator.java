package Assignments.FirstJava;
import java.util.Scanner;

public class Calculator {  // Calculator Programme
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while  (true) {
            System.out.print("Enter the operation - ");
            char op = sc.next().trim().charAt(0);
            if ( op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter the Numbers - ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (op == '+'){
                    ans = a+b;
              }
                if (op == '-'){
                    ans = a-b;
                }
                if (op == '*'){
                    ans = a*b;
                }
                if (op == '/'){
                    if (a==0){
                        System.out.println(" Invalid, First number can not be 0");
                        continue;
                    }
                    ans = a/b;
                }
                if (op == '%'){
                    ans = a%b;
                }
            } else if ( op == 'x' || op =='X') { // Breaks whenever user type x or X
                break;
            } else{
                System.out.println(" Invalid operation!! ");
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
