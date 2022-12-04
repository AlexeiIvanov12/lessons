package lesson2;

import java.util.Scanner;

public class EasyHW2 {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 7: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Вы ввели понедельник");
        } else if (input == 2) {
            System.out.println("Вы ввели вторник");
        } else if (input == 3) {
            System.out.println("Вы ввели среда");
        } else if (input == 4) {
            System.out.println("Вы ввели четверг");
        } else if (input == 5) {
            System.out.println("Вы ввели пятница");
        } else if (input == 6) {
            System.out.println("Вы ввели выходной");
        } else if (input == 7) {
            System.out.println("Вы ввели выходной");
        } else  {
            System.out.println("Вы ввели число вне диапазона");
        }
    }
}

