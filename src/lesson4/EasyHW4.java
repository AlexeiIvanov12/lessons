package lesson4;
import java.util.Random;

// Создайте массив из 12 случайных целых чисел из отрезка [0;30].
//Определите какой элемент является в этом массиве максимальным и выведите в консоль его индекс.


public class EasyHW4
{
    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[12];
        for (int i=0; i<array.length; i++) {
            array [i] = rand.nextInt(30);
            System.out.print(array[i] +" ");
        }
        System.out.println();
        int max = 0;
        for(int m:array) {
            if (m > max) {
                max = m;
            }

        }
        System.out.print("Максимальное число в массиве = "+ max );
    }
}
