package lesson2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        int count = 0;
//        while (count < 3) {
//            System.out.println("Hello, world!");
//            count = count + 1; // count++ инкремент
//        }
//
//        int y, x=0 ;
//        y = x++;
//        System.out.println("x = "+ x+" , y= " +y);
//        y = ++x;
//        System.out.println("x = "+ x+" , y= " +y);
//
//        int y= x--;
//        y = x--;
//        System.out.println("x = "+ x+" , y= " +y);
//        y = --x;
//        System.out.println("x = "+ x+" , y= " +y);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("введите 555 чтобы подтвердить что вы не робот");
//        int input = scanner.nextInt();
//
//        while (input !=555) {
//            System.out.println("введите 555 чтобы подтвердить что вы не робот");
//            input = scanner.nextInt();

//        int input;
//        do {
//            System.out.println("введите 555 чтобы подтвердить что вы не робот");
//            input = scanner.nextInt();
//        } while (input != 555);
//
//
//        System.out.println("Вы успешно подтвердили что вы не робот");

//        for (int i=0; i<10; i++) {
//            System.out.println("i = " +i);
//        }

        // написать шифратор цезаря

//        Scanner scanner1 = new Scanner(System.in);
//        String word = scanner1.nextLine();
//
//        int key = 1;
//        String result= "";
//
//        for (int i=0; i < word.length(); i++)
//        {
//            char ch = word.charAt(i);
//            char encodeCh = (char) (ch+key);
//
//            result = result + encodeCh;
//        }
//        System.out.println(result);

//        операторы break и continue в цикле for
//
//        for (int i=0; i<10; i++) {
//            if (i == 8) {
//                break;
//            }
//
//            if (i == 5) {
//                continue;
//            }
//            System.out.println("i = " + i);
//        }


//        операторы break и continue для цикла while

//        int i = 0;
//        while (i<10)
//        {
//            if (i==5) {
//                i++;
//                continue;
//            }
//            System.out.println("i = " + i);
//
//        }

        int i = 0;
        while (i < 10) {
            if (i == 8){
                break;
            }

            if (i == 5) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;




        }
}}



