package lesson3;


import java.util.Scanner;

// Вывести на экран числа списом от n до 0

public class EasyHW3 {
    public static void main(String[] args) {
        System.out.println("Введите n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int max = n;
        int[] array = new int[n];
        for (int i = n-1; i>=0 ; i--) {
            if (i<max) {
               array[i] =i;
            }
            System.out.print(array[i]+ " ");
        }
    }
}
