package lesson2;

import java.util.Scanner;

public class NormalHW2 {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Вы ввели понедельник");
                        break;
                    case 2:
                        System.out.println("Вы ввели вторник");
                        break;
                    case 3:
                        System.out.println("Вы ввели среда");
                        break;
                    case 4:
                        System.out.println("Вы ввели четверг");
                        break;
                    case 5:
                        System.out.println("Вы ввели пятница");
                        break;
                    case 6:

                    case 7:
                        System.out.println("Вы ввели выходной");
                        break;
                    default:
                        System.out.println("Вы ввели число вне диапазона");


                }


    }
}
