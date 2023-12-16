package shaps_volume;

import java.util.ArrayList;

class Shape {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

class Body extends Shape {
    private double radius;

    public Body(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }
}

class Ball extends Body { // конкретный класс
    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}

class Cylinder extends Body {  // Цилиндр
    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}

class Pyramid extends Shape{  // Пирамида
    private double height;
    private double s; // площадь основания

    public Pyramid(double height, double s) {
        super(height * s * 4 / 3);
        this.height = height;
        this.s = s;
    }
}


class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available;  // доступный

    public Box(double available) {
        super(available);  // передаем переменную volume в конструктор родительского класса
        this.available = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("Создать класс Box, который является контейнером, он можем содержать в себе другие фигуры. \n" +
                "Метод add() принимает на вход Shape. Нужно добавлять новые фигуры до тех пор, пока для них хватает \nместа в Box " +
                "(будем считать только объём, игнорируя форму. Допустим, мы переливаем жидкость). \n" +
                "Если места для добавления новой фигуры не хватает, то метод должен вернуть false. \n");

        Ball ball = new Ball(4.5);
        Cylinder cylinder = new Cylinder(2, 5);
        Pyramid pyramid = new Pyramid(50, 30);

        Box box = new Box(1000);

        System.out.println(ball.getVolume() + " -> " + box.add(ball)); // true
        System.out.println(cylinder.getVolume() + " -> " + box.add(cylinder)); // true
        System.out.println(pyramid.getVolume() + " -> " + box.add(pyramid)); // failed
    }
}
