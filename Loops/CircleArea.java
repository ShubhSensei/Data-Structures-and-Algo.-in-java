package Assignments.Loops;
import java.util.*;

public class CircleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the radius - ");
        int a = in.nextInt();
        double circle = 3.14 * (Math.pow(a, 2));
        System.out.println("ARea of circle - " + circle);
        in.close();
    }   
}
