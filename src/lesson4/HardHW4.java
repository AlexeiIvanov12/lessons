package lesson4;
import java.util.Random;
import java.util.Arrays;

public class HardHW4 {
    //    Создайте массив из 10 случайных целых чисел из отрезка [0;100).
//Отсортируйте данный массив и выведите результат в консоль.
//
//Например, имеется следующий массив: 45, 37, 79, 45.
//Отсортированный массив: 37, 45, 45, 79.
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(0, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();


        for (int i = 0; i < array.length; i++) {


            System.out.println(Arrays.toString(array));


//      Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        }
    }
}
