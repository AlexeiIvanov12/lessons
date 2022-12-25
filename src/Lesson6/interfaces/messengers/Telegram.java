package Lesson6.interfaces.messengers;

public class Telegram implements Messenger, Aplication{



    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в телеграм");

    }

    @Override
    public void getMessage() {
        System.out.println("читаем сообщение в телеграм");

    }

    @Override
    public  void start() {
        System.out.println( " start aplication");
    }


}
