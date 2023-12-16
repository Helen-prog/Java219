package generics_program;

//класс с описанием фигуры прямоугольника
public class Rectangle extends Figure {

    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
