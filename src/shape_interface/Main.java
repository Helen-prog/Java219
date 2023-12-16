package shape_interface;

interface GeomInterface {
    int MIN_COORD = 0;
    int MAX_COORD = 1000;

    static void showInterval() {
        System.out.println("[" + MIN_COORD + "; " + MAX_COORD + "]");
    }

    default double getSquare() {
        return -1;
    }
}

//class InterfaceGroup {
//    private interface Interface_1 {
//        void method_1();
//
//        private void privateMethod() {
//            System.out.println("privateMethod");
//        }
//    }
//
//    interface Interface_2 extends Interface_1{
//        void method_2();
//    }
//}

//class ReleaseInterface implements InterfaceGroup.Interface_2 {
//    public void method_1() { }
//    public void method_2() { }
//}

interface MathGeom {
    default double getSquare() {
        return 0;
    }
}

abstract class Geom implements MathGeom{
    int width, color;
    abstract void draw();

}

class Line extends Geom implements MathGeom, GeomInterface {
    void draw() {
        System.out.println("Рисование линии");
    }
    public double getSquare() {
        return GeomInterface.super.getSquare();
    }
}

//class Line implements GeomInterface {
//    int x1, y1, x2, y2;
//
//    public Line(int x1, int y1, int x2, int y2) {
//        this.x1 = x1;
//        this.y1 = y1;
//        this.x2 = x2;
//        this.y2 = y2;
//    }
//
//    void draw() {
//        System.out.println("Рисование линии");
//        GeomInterface.showInterval();
//    }
//
//    private boolean isCheck(int x) {
//        return (MIN_COORD <= x && x <= MAX_COORD);
//    }
//
//    void setCoord(int x1, int y1, int x2, int y2) {
//        if(isCheck(x1) && isCheck(y1) && isCheck(x2) && isCheck(y2)) {
//            this.x1 = x1;
//            this.y1 = y1;
//            this.x2 = x2;
//            this.y2 = y2;
//        }
//    }
//
//    public void info() {
//        System.out.println("Координаты линии: " + this.x1 + " " + this.x2 + " " + this.y1 + " " + this.y2);
//    }
//
//}

public class Main {
    public static void main(String[] args) {
        Line l = new Line();
        System.out.println("Площадь линии: " + l.getSquare());

//        Line l = new Line(10, 20, 30, 40);
//        l.setCoord(50, 60, 70, 80);
//        l.info();
//        l.setCoord(-150, 160, 170, 180);
//        l.info();
//        GeomInterface.showInterval();
//        l.draw();
    }
}
