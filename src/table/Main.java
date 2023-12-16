package table;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создайте базовый класс 'Стол' и дочерние: 'Прямоугольный стол' и 'Круглый стол'. Через конструктор \n" +
                "базового класса передайте размер поверхности стола: для прямоугольного - ширина и высота, для\n" +
                "круглого - радиус. В дочерних классах реализуйте метод вычисления площади поверхности стола.\n");

        SquareTable t = new SquareTable(20, 10);
        t.calcArea();
        SquareTable t2 = new SquareTable(20);
        t2.calcArea();
        RoundTable t3 = new RoundTable(20);
        t3.calcArea();
    }
}
