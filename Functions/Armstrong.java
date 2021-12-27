package Assignments.Functions;
import java.util.*; 

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArms(n));
        in.close();
    }
    static boolean isArms(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum+=rem*rem*rem;
        }
        return sum==original; 
    }
}