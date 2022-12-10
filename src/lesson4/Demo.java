package lesson4;

public class Demo {
    public static void main(String[] args) {
//        работа с объектами
      Phone phone = new Phone();
        phone.number = 8905;
        phone.model = "iphone";
        phone.weight = 245;

        phone.receiveCall("Felix");
      int number = phone.getNumber();
      System.out.println(number);

      System.out.println(phone.number);
        System.out.println(phone.model);
        System.out.println(phone.weight);

      Phone phone1 = new Phone();

      Phone phone2 = new Phone();

    }
}
