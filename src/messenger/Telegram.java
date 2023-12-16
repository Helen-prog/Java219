package messenger;

public class Telegram implements Messenger {
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Telegram!");
    }

    public void getMessage() {
        System.out.println("Читаем сообщение в Telegram!");
    }
}
