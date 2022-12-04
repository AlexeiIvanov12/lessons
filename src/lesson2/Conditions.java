package lesson2;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Идет дождь true/false?");
//        boolean isRaining = scanner.nextBoolean();
//        if (isRaining) {
//            System.out.println("Возьмите с собой зонт");
//        } else {
//            System.out.println("можно не брать зонт");
//        }


        /* ВВсети с клавиатуры 2 целых числа а и б написать программу делится ли нацела  а и б */

//                System.out.println("Введите 2 числа?");
//                int a = scanner.nextInt();
//                int b = scanner.nextInt();
//                if (a % b == 0) {
//                System.out.println("Делится без остатка");
//                } else {
//                System.out.println("НЕ Делится без остатка");
        //              }

//            int input;
//        System.out.println("Загадайте число от 1 до 5 включительно");
//        input  = scanner.nextInt();
//        if (1 <= input && input<= 5) {
////            // если ввести 1 раз & проверит только левую часть если трю -идет дальше если фолс не идет
////            if (input == 1) {
////                System.out.println("Вы загадали цифру one");
////            }
////            if (input == 2) {
////                System.out.println("Вы загадали цифру two");
////            }
////            if (input == 3) {
////                System.out.println("Вы загадали цифру three");
////            }
////            if (input == 4) {
////                System.out.println("Вы загадали цифру four");
////            }
////            if (input == 5) {
////                System.out.println("Вы загадали цифру five");
////            }
//            if (input == 1) {
//                System.out.println("Вы загадали цифру one");
//            } else if (input == 2) {
//                System.out.println("Вы загадали цифру two");
//            } else if (input == 3) {
//                System.out.println("Вы загадали цифру three");
//            } else if (input == 4) {
//                System.out.println("Вы загадали цифру four");
//            } else if(input == 5) {
//                System.out.println("Вы загадали цифру five");
//            }
//        }
//        } else {
//
//           System.out.println("Вы загадали цифру вне диапазона");
//        }
//        }
//}

        //System.out.println("Загадайте число от 1 до 5 включительно");
       // int input;
        //input = scanner.nextInt();


//        switch (input) {
//            case 1:
//                System.out.println("Вы загадали цифру one");
//                break;
//            case 2:
//                System.out.println("Вы загадали цифру two");
//                break;
//            case 3:
//                System.out.println("Вы загадали цифру three");
//                break;
//            case 4:
//                System.out.println("Вы загадали цифру four");
//            case 5:
//                System.out.println("Вы загадали цифру five");
//                break;
//            default:
//                System.out.println("Вы загадали цифру вне диапазона");
/*ввести с клавиатуры чичсло от 1 до 10 написать програамму определяющую четное число */


//                System.out.println("Загадайте число от 1 до 10 включительно");
//                int input;
//                input = scanner.nextInt();
//
//                if (input<=10 && input>=1) {
//                    if (input % 2 == 0) {
//                        System.out.println("Число является четным");
//                    } else {
//                        System.out.println("Число не является четным");
//                    }
//                } else{
//                        System.out.println("Число вне диапазона");
//                    }


        System.out.println("Загадайте число от 1 до 5 включительно");
                int input;
                input = scanner.nextInt();
               switch (input) {
                   case 1:
                   case 3:
                   case 5:
                       System.out.println("Число является не четным");
                       break;
                   case 2:
                   case 4:
                       System.out.println("Число является четным");
                       break;
                   default:
                       System.out.println("Число вне диапазона");

               }









        }

    }





