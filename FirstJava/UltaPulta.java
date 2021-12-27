package Assignments.FirstJava;

public class UltaPulta { // WAP to Reverse the digits of any given number
    public static void main(String[] args) { // 2 methods
        int n = 235979;
        while (n>0) {
            int rem = n % 10;  
            System.out.print(rem);
            n = n/ 10;
        }
   // 2nd method 
   int ans = 0;
   while (n >0){
        int rem = n%10;
        n/=10;
        ans = ans *10 + rem;
    }
        System.out.print(ans);
    }
}
