package resizable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Напишите Java-программу для создания интерфейса с возможностью изменения размера \n" +
                "с помощью методов resize Width(int width) и resize Height(int height), которые \n" +
                "позволяют изменять размер объекта. Создайте класс Rectangle, который реализует \n" +
                "интерфейс с возможностью изменения размера и реализует методы изменения размера.\n");

        Rectangle rectangle = new Rectangle(100, 150);

        rectangle.printSize();

        rectangle.resizeWidth(250);
        rectangle.resizeHeight(300);

        rectangle.printSize();
    }
}
