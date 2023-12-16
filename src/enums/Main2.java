package enums;

public class Main2 {
    public static void main(String[] args) {
        System.out.printf("%h%n", Color.RED.getColor());
    }

    enum Color{
        RED(0xFFFF0000),
        GREEN(0xFF00FF00),
        BLUE(0xFF0000FF);

        private final int value;
        public int getColor(){return value;}
        Color(int value){this.value=value;}
    }
}
