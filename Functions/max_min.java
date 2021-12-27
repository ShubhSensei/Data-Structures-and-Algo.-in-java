package Assignments.Functions;
import java.util.*;

public class max_min {
    public static void main(String[] args) { /*Define two methods to print the maximum and
         the minimum number respectively among three numbers entered by the user.*/

           Scanner in = new Scanner(System.in);
           System.out.println("Press a for max or b for min : ");
           char word = in.next().trim().charAt(0);
           if (word == 'a'){
                max();
           } else if(word == 'b'){
               min();
           } 
           in.close();
    }
    static void max(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers Rsp. : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int temp = 1;
        if(a>b){
            temp = a;
        } else if (b>a) {
            temp = b;
        } else {
            temp = 1;
        }
        
        if(c>temp){
            temp = c;
        } else {
            System.out.println(temp);
        }
        System.out.println("max is : "+temp);
        in.close();
    } 
    static void min(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers Rsp. : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int temp = 1;
        if(a<b){
            temp = a;
        } else if (b<a) {
            temp = b;
        } else {
            temp = 1;
        }
        
        if(c<temp){
            temp = c;
        } else {
            System.out.println(temp);
        }
        System.out.println("min is : "+temp);
        in.close();
    } 
}
