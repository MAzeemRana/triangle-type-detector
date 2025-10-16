// TriangleType.java
import java.util.Scanner;

public class TriangleType {

    public static String findTriangleType(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Not a valid triangle";
        }
        if (a == b && b == c) {
            return "Equilateral triangle";
        }
        else if (a == b || b == c || a == c) {
            return "Isosceles triangle";
        }
        else {
            return "Scalene triangle";
        }
    }
    public static String angleType(double a, double b, double c) {
        double[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        a = sides[0];
        b = sides[1];
        c = sides[2];
        double a2 = a * a;
        double b2 = b * b;
        double c2 = c * c;
        if (a2 + b2 > c2) {
            return "Acute triangle";
        } else if (a2 + b2 == c2) {
            return "Right-angled triangle";
        } else {
            return "Obtuse triangle";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = input.nextDouble();
        System.out.print("Enter side b: ");
        double b = input.nextDouble();
        System.out.print("Enter side c: ");
        double c = input.nextDouble();
        String type = findTriangleType(a, b, c);
        String angle = angleType(a, b, c);
        System.out.println("\nResult:");
        System.out.println("Triangle Type: " + type);
        System.out.println("Angle Type: " + angle);
        input.close();
    }
}
