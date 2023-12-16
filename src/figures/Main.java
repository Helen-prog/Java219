package figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        System.out.println("enter A: ");
        a.read(scanner);
        System.out.println("enter B: ");
        b.read(scanner);
        System.out.println("enter C: ");
        c.read(scanner);
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Площадь: " + triangle.square());
        System.out.println("Периметр: " + triangle.perimeter());
        System.out.print("Медиана: ");
        triangle.median_crossing().print();
    }
}
