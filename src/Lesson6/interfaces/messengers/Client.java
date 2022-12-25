package Lesson6.interfaces.messengers;

public class Client {
//    private WhatsApp whatsApp;
//    private Telegram telegram;
//    private Viber viber;

//    private Messenger messenger;
    private Smartphone smartphone;

    public Smartphone getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "smartphone=" + smartphone +
                '}';
    }
}
