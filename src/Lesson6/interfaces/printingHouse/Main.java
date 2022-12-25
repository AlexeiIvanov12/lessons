package Lesson6.interfaces.printingHouse;

//1. Интерфейс Printable
//
//Определить интерфейс Printable, содержащий метод void print().
//Определить класс Book, реализующий интерфейс Printable.
//Определить класс Magazine, реализующий интерфейс Printable.
//Создать массив типа Printable, который будет содержать книги и журналы.
//В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
//Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof.
//Смотрите решение задачи в видео.

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.autor = "Draiser";

        Book book2 = new Book();
        book2.autor = "Rend";

        Magazine magazine1 = new Magazine();
        magazine1.name = "GQ";

        Magazine magazine2 = new Magazine();
        magazine2.name = "MensHealth";


        Printable [] array = {book1,book2,magazine1,magazine2};
        for (int i=0; i<array.length;i++)
            array[i].print();
        System.out.println();

        Magazine.printMagazines(array);
        System.out.println();
        Book.printBooks(array);
    }
}

