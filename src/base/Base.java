package base;

interface ShapeInterface {
    void info();
}

interface MathShape {
    double getSquare();
}

abstract class Shape {
    protected int width;
    String color;

    public Shape(int width, String color) {
        this.width = width;
        this.color = color;
    }

    abstract void draw();
}

class Line extends Shape implements ShapeInterface {
    private int x1, x2, y1, y2;

    public Line(int width, String color, int x1, int x2, int y1, int y2) {
        super(width, color);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    void draw() {
        System.out.println("Рисование линии");
    }

    public void info() {
        System.out.println("Координаты линии: " + this.x1 + " " + this.x2 + " " + this.y1 + " " + this.y2 + "\n");
    }
}

class Rectangle extends Shape implements MathShape, ShapeInterface {
    private int width;
    private int height;

    public Rectangle(int width, String color, int width1, int height) {
        super(width, color);
        this.width = width1;
        this.height = height;
    }

    void draw() {
        System.out.println("Рисование прямоугольника");
    }

    public double getSquare() {
        return this.width * this.height;
    }

    public void info() {
        System.out.println("Ширина: " + this.width + "\nВысота: " + this.height + "\n");
    }
}

class Triangle extends Shape implements MathShape, ShapeInterface {
    private int length;
    private int height;

    public Triangle(int width, String color, int length, int height) {
        super(width, color);
        this.length = length;
        this.height = height;
    }

    void draw() {
        System.out.println("Рисование треугольника");
    }

    public double getSquare() {
        return 0.5 * this.length * this.height;
    }

    public void info() {
        System.out.println("Длина: " + this.length + "\nВысота: " + this.height + "\n");
    }
}

public class Base {
    public static void main(String[] args) {
        final int N = 3;
        Shape geom[] = new Shape[N];
        geom[0] = new Line(5, "red", 1, 2, 3, 4);
        geom[1] = new Rectangle(2, "yellow", 5, 10);
        geom[2] = new Triangle(3, "green", 4, 10);

        ShapeInterface sh[] = new ShapeInterface[N];
        sh[0] = new Line(5, "red", 1, 2, 3, 4);
        sh[1] = new Rectangle(2, "yellow", 5, 10);
        sh[2] = new Triangle(3, "green", 4, 10);

        for (int i = 0; i < geom.length; i++) {
            geom[i].draw();

            if (geom[i] instanceof MathShape) {
                double s = ((MathShape) geom[i]).getSquare();
                System.out.println("Площадь: " + s);
            }

            sh[i].info();
        }
    }
}
