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
/*Hello Shuvadeep 😃, 
Hope you & your family are fine, BTW Shubham Bansal this side.
I'm just looking for strong teammates for the hackathon & Honestly while I was scrolling, your Profile shined like a Diamond in my eyes. 
So, would you like to collaborate with me so that we can contribute as much as possible and win the Hackathon.

You can connect with me at - 
Twitter - https://twitter.com/ImBansalShubham
Linkedin - https://www.linkedin.com/in/sensationalshubham/

    */