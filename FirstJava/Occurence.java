package Assignments.FirstJava;


public class Occurence{ // WAP How many times a single digit occurs
    public static void main(String[] args) {
        int n  = 125553;
        
        int count = 0;
        while (n > 0) {
            int r = n % 10;
            if (r == 5) {
                count = count +1;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
