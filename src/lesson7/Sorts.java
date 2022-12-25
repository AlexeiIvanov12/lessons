package lesson7;

import tasks.Array;

import java.util.Arrays;

public class Sorts {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 7};
        System.out.println("Before: " + Arrays.toString(array));
        bubleSort(array);
        System.out.println("After: " + Arrays.toString(array));
        bubleSortEffective(array);
        System.out.println("After: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("After: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("After: " + Arrays.toString(array));

    }

    private static void bubleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }

    }
    private static void bubleSortEffective(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i=0; i< array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                    sorted = false;
                }
            }
        }
    }

    private static void selectionSort(int[] array) {
        for (int i=0; i< array.length; i++) {
            int min = array[i];
            int indexOfmin = i;
            for (int j =i+1; j< array.length;j++){
                if (array[j] < min) {
                    min = array[j];
                    indexOfmin = j;
                }
            }
            swap(array, i, indexOfmin);
        }
    }

    private static void insertionSort(int[] array) {
        for (int i=1; i< array.length;i++) {
            int current = array[i];
            int j = i-1;

            while (j>=0 && current <array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array [j+1] = current;
        }
    }

    private static void swap (int[] array, int left, int right) {}
}
