package shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создать класс Shape и три дочерних класса: Square, Rectangle, Triangle.\n" +
                "Родительский класс должен иметь абстрактные методы нахождения периметра, площади, рисования фигуры \n" +
                "и вывода информации. С помощью полиморфизма реализуйте вывод информации о дочерних фигурах.\n");

        final int N = 3;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(3, "red");
        shapes[1] = new Rectangle(7, 3, "green");
        shapes[2] = new Triangle(5, "yellow");

        for (Shape shape : shapes) {
            shape.info();
        }


    }
}

