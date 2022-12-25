package Lesson6.interfaces.messengers;

public class Viber implements Messenger, Aplication{

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в viber");

    }

    @Override
    public void getMessage() {
        System.out.println("Отправляем сообщение в viber");

    }
    @Override
    public  void start() {
        System.out.println( " start aplication");
    }
}

