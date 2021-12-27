package Assignments.Loops;
import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the base & height - ");
        int a = in.nextInt();
        int b = in.nextInt();
        int area = (a*b)/2;
        System.out.println("Area of triangle is - " + area);
        in.close();
    }
}
