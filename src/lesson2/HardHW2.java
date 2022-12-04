package lesson2;

import java.util.Locale;
import java.util.Scanner;

public class HardHW2 {
    public static void main(String[] args) {
        System.out.println("Большой и синий с усами, полностью набит зайцами! Что это? Введите ответ:");
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
//        switch (input) {
//            case "Троллейбус":
//                System.out.println("Верно!");
//                break;
//            default:
//                System.out.println("Не угадал!");
//
//

        //if      ((input.trim()).equalsIgnoreCase(("Троллейбус")))
        input = input.toLowerCase();
       if      ((input).contains("троллейбус"))
           {
        System.out.println("Верно!");
        } else {
            System.out.println("Не угадал!");
        }



    }
}
