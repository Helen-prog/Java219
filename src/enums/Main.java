package enums;

// Имитация автоматизированного светофора с помощью
// перечисления, описывающего переключаемые цвета светофора.

// Перечисление, представляющее состояния светофора,
enum TrafficLightColor {
    RED, GREEN, YELLOW
}

// Имитация автоматизированного светофора,
class TrafficLightSimulator implements Runnable {
    private Thread thrd; // Поток для имитации светофора
    private TrafficLightColor tic; // Текущий цвет светофора
    boolean stop = false; // Остановка имитации, если истинно
    boolean changed = false; // Переключение светофора, если истинно

    TrafficLightSimulator(TrafficLightColor init) {
        tic = init;

        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator() {
        tic = TrafficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    // Запуск имитации автоматизированного светофора,
    public void run() {
        while(!stop) {

            try {
                switch(tic) {
                    case GREEN:
                        Thread.sleep(10000); // Зеленый на 10 секунд
                        break;
                    case YELLOW:
                        Thread.sleep(2000); // Желтый на 2 секунды
                        break;
                    case RED:
                        Thread.sleep(12000); // Красный на 12 секунд
                        break;
                }
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor() ;
        }
    }

    // Переключение цвета светофора,
    synchronized void changeColor() {

        switch(tic) {
            case RED:
                tic = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tic = TrafficLightColor.RED;
                break;
            case GREEN:
                tic = TrafficLightColor.YELLOW;
        }

        changed = true;
        notify(); // уведомить о переключении цвета светофора
    }

    // Ожидание переключения цвета светофора.
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait(); // ожидать переключения цвета светофора
            changed = false;
        } catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // Возврат текущего цвета.
    TrafficLightColor getColor() {
        return tic;
    }

    // Прекращение имитации светофора,
    void cancel() {
        stop = true;
    }
}

class Main {
    public static void main(String args[]) {
        TrafficLightSimulator tl =
                new TrafficLightSimulator(TrafficLightColor.GREEN);

        for (int i=0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }
}

//enum Transport {
//    CAR(65),   // машина
//    TRUCK(55),  // грузовик
//    AIRPLANE(600),  // самолет
//    TRAIN(70),  // поезд
//    BOAT(22);  // лодка
//
//    // Объявление переменной экземпляра.
//    private int speed; // обычная скорость каждого транспортного средства
//
//    // Объявление конструктора
//    Transport(int s) {
//        speed = s;
//    }
//
//    // Определение метода
//    int getSpeed() {
//        return speed;
//    }
//}
//
//class Main {
//    public static void main(String args[]) {
//        System.out.println("С использованием enum выведите скорости транспортных средств:\n");
//        // отобразить скорость самолета
//        // Скорость определяется с помощью метода getSpeed().
//        System.out.println("Скорость самолета составляет " +
//                Transport.AIRPLANE.getSpeed() +
//                " миль в час.\n");
//
//        // отобразить все виды транспорта и скорости их передвижения
//        System.out.println("Скорости транспортных средств: ");
//        for (Transport t : Transport.values())
//            System.out.println(t + " типичная скорость составляет " +
//                    t.getSpeed() +
//                    " миль в час.");
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("С использованием Enum необходимо выбрать случайное направление движения:\n");
//        Direction direction = Direction.randomDirection();
//        System.out.println(direction);
//    }
//}

//public class Main {
//    public enum Length {
//        KM("Километр", 1000), M("Метр", 1), DM("Дециметр", 0.1), CM("Сантиметр", 0.01), MM("Миллиметр",0.001);
//
//        String name;
//        double d;
//
//        Length(String name, double d) {
//            this.name = name;
//            this.d = d;
//        }
//
//        @Override
//        public String toString() {
//            return name;
//        }
//
//        double coefficient(Length inp) {
//            return d/inp.d;
//        }
//
//    }
//    public static void main(String[] args) {
//        for(Length l1: Length.values()) {
//            for (Length l2 : Length.values()) {
//                if (l1 != l2) {
//                    System.out.println("1 " + l1 + " = " + l1.coefficient(l2) + " " + l2);
//                }
//            }
//            System.out.println();
//        }

//Два способа получения enum объекта по строковому представлению
//        System.out.println(Length.valueOf("KM"));
//        System.out.println(Enum.valueOf(Length.class, "KM"));
//    }
//}
//import java.util.regex.Pattern;
//
//enum RegEx {
//    UPPER("[A-Z]+"), LOWER("[a-z]+"), NUMERIC("[+-]?[0-9]+");
//
//    private final Pattern pattern;
//
//    RegEx(final String pattern) {
//        this.pattern = Pattern.compile(pattern);
//    }
//
//    public boolean test(final String input) {
//        return this.pattern.matcher(input).matches();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Создать Enum, который даст возможность проверять введенную строку на содержание\n" +
//                "букв верхнего, нижнего регистра или цифр (по отдельности): \n");
//        System.out.print("В строке 'ABC' содержатся только буквы в верхнем регистре: ");
//        System.out.println(RegEx.UPPER.test("ABC"));
//        System.out.print("В строке 'abc' содержатся только буквы в нижнем регистре: ");
//        System.out.println(RegEx.LOWER.test("abc"));
//        System.out.print("В строке '+111' содержатся только цифры или символы '+-': ");
//        System.out.println(RegEx.NUMERIC.test("+111"));
//    }
//}
//enum Direction
//{
//    UP,
//    DOWN,
//    LEFT,
//    RIGHT,
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Direction direction = Direction.LEFT;
//
//        if (direction == Direction.LEFT)
//            direction = Direction.RIGHT;
//        else
//            direction = Direction.DOWN;
//
//        System.out.println(direction);
//    }
//}

//enum Seasons {
//    WINTER("Зима"),
//    SUMMER("Лето"),
//    SPRING("Весна"),
//    AUTUMN("Осень");
//
//    private String title;
//
//    Seasons(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public String toString() {
//        return "Seasons{" +
//                "title='" + this.title + '\'' +
//                '}';
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        for (Seasons s : Seasons.values()) {
//            System.out.println(s.name());
//        }
//        int summerIndex = Seasons.SUMMER.ordinal();
//        System.out.println(summerIndex);
//
//    }
//}
