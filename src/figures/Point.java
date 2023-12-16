package figures;

import java.util.Scanner;

public class Point {
    public double x, y;
    public Point(double x_, double y_) {
        x = x_;
        y = y_;
    }
    public Point() {
        this(0, 0);
    }
    public static double distance(Point a, Point b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void print() {
        System.out.println("x: " + x + ", y: " + y);
    }
    public void read(Scanner scanner) {
        System.out.print("x: ");
        x = scanner.nextDouble();
        System.out.print("y: ");
        y = scanner.nextDouble();
    }
}
