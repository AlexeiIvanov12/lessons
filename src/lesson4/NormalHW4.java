package lesson4;

import java.util.Random;
import java.util.Scanner;

//Создайте массив из 10 случайных целых чисел из отрезка [20;100).
//Выведите в консоль содержимое массива, чтобы пользовател ввел с клавиатуры число из этого массива.
//Выведите в консоль индекс элемента, который ввел пользователь, в массиве.
//Если пользователь ввел число, которого нету в массиве, то выведите ошибку.

public class NormalHW4 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[10];
        System.out.println("Введите число из списка ");


        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20, 100);
        }
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {


                System.out.println("Индекс введенного числа = " + i);
                index = i;
                break;
            }
        }

        if (index == -1) {

            System.out.print("Ошибка ");
        }
    }


}






































