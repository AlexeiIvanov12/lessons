package Lesson6.interfaces.messengers;

public class Main {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        Client client = new Client();

        Smartphone smartphone = new Smartphone();
        smartphone.setAplication(telegram);

        client.setSmartphone(smartphone);

        client.getSmartphone().getAplication().start();

        Messenger messenger = telegram;
        messenger.sendMessage();
        messenger.getMessage();
    }
}
