package tasks;

import java.util.Scanner;

public class InputDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i =0; i<5; i++) {
            Double a = scanner.nextDouble();
            Double b = scanner.nextDouble();

            while (b != 0) {
                System.out.println(a / b);
            break; }
            if (b==0) {
                System.out.println("Деление на 0");
            }

            }
        }
    }

