package shape;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle( int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public void info() {
        System.out.printf("=== Прямоугольник ===%nШирина: %d%nВысота: %d%nЦвет: %s%nПлощадь: %.1f%nПериметр: %.1f%n", this.width, this.height, getColor(), getArea(), getPerimeter());
        draw();
    }

    public void draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
