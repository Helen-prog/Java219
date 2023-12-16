package start;

interface Event {
    void start();
}

class Button {
    Event handler;
    Button(Event action) {
        handler = action;
    }
    public void press() {
        handler.start();
    }
}

class ButtonClick implements Event {
    @Override
    public void start() {
        System.out.println("Кнопка была нажата!");
    }
}

public class Main {
    public static void main(String[] args) {
        Button lampButton = new Button(new Event() {
            private boolean on = false;

            @Override
            public void start() {
                if (on) {
                    System.out.println("Лампа включена!");
                    on = false;
                } else {
                    System.out.println("Лампа выключена!");
                    on = true;
                }
            }
        });

        Button printButton = new Button(new Event() {
            @Override
            public void start() {
                System.out.println("Запущен процесс печати!");
            }
        });

        lampButton.press();
        printButton.press();
        lampButton.press();
    }
}