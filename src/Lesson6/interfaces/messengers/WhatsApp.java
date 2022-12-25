package Lesson6.interfaces.messengers;

public class WhatsApp implements Messenger, Aplication{



    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в whatsapp");

    }

    @Override
    public void getMessage() {
        System.out.println("Отправляем сообщение в whatsapp");

    }
    @Override
    public  void start() {
        System.out.println( " start aplication");
    }
}
