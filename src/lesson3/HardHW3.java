package lesson3;

import java.util.Scanner;

public class HardHW3 {
    public static void main(String[] args) {
        System.out.println("Ввести n");
        Scanner scanner = new Scanner (System.in);
        int n= scanner.nextInt();

        System.out.println("числовые значения Фибоначи");

        int [] array = new int[n];

        for (int i=0; i<n; i++) {
                array[i]=i;

                if (i>1){
                array[i] = array[i-1]+array[i-2];


                }
            if (array[i] >n){
                break;
            }

            System.out.print(array[i]+ " ");
            }

        }

    }

