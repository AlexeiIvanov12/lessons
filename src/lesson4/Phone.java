package lesson4;

public class Phone {
/*опишем чертежи
 Класс Phone.
         1. Создайте класс Phone, который содержит переменные number, model и weight.
         2. Создайте три экземпляра этого класса.
         3. Выведите на консоль значения их переменных.
         4. Добавить в класс Phone методы:
         - receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
         - getNumber – возвращает номер телефона.
         Вызвать эти методы для каждого из объектов. */


    int number;
    String model;
    int weight;

    int getNumber() {
        return number;

    }

    String getModel() {
        return model;
    }

    int getWeight() {
        return weight;
    }

     void receiveCall(String name) {
        System.out.println("Звонит "+ name);
    }
}
