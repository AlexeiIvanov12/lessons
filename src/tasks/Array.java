package tasks;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("введите длину массива n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];


        for (int i = 0; i < array.length; i++) {
            array[i] = i;

            System.out.print(array[i] + " ");

        }
        System.out.println();
        int sum = 0;
        for (int x : array)
            sum = sum + x;
        System.out.println("Сумма чисел массива = " + sum);
       // System.out.println();
        System.out.println("Длина массива:" + array.length);


        int z = 0;
        for (int y : array) {
            if (y > 8)
                z = z + 1;

        }
                System.out.println("Количество элементов больше 8 = " + z);


        int e =0;
        for (int w:array) {
            if (w ==1)
                e = e + w / w;
            }
                System.out.println("Количество элементов равных 1 = " + e);

        int c = 0;
        for (int h:array) {
            if (h !=0 && h%2 ==0)
                c= c+1;
        }
        System.out.println("Количество четных чисел = " +c);

        int k = 0;
        for(int j:array) {
            if (j%2 !=0)
                k= ++k;
        }
        System.out.println("Количество не четных чисел = "+k);







    }
}








