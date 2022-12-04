package lesson2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("введите целое число: ");
//        int input = scanner.nextInt();
//        System.out.println("Вы ввели "+ input);

//        System.out.println("введите ваше имя : ");
//        String input = scanner.next();
//        System.out.println("Вы ввели "+ input);

//        System.out.println("введите ФИО : ");
//        String input = scanner.nextLine();
//        System.out.println("Вы ввели "+ input);

//        System.out.println("введите радиус : ");
//        }
//        System.out.println("Площадь круга = "+ r * r *3.14);

        System.out.println("введите радиус : ");
        double radius = scanner.nextDouble();
        double s = Math.PI * Math.pow(radius,2);
        System.out.printf("Площадь круга с радиусом %.14f равно %.14f", radius,s);
        // %.14f вызывает переменную radius 14 знаков после запятой и переменную s



    }
}
