package tasks;
import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        int [] array = new int[100];
        Random rand = new Random();
        for (int i=0; i<100; i++) {
           //array [i] = Math.ceil(Math.random() *10000);   - то же самое только с  double
            array [i] = rand.nextInt(10000); // наполнеиние массива рандомными числами меньше 10000
            System.out.print(array [i]+ " ");
        }
        System.out.println();
        int min = Integer.MAX_VALUE;
        for (int a : array){
            if (a < min) {
                min = a;
            }}
            System.out.println("Минимальное значение в массиве = " + min);
        int max = Integer.MIN_VALUE;
        for (int b :array){
            if (b > max) {
                max = b;
            }
        }
        System.out.println("Максимальное значение в массиве = " + max);

           int summ = 0;
        for (int c :array){
            if(c%10 ==0) {
            summ = summ + 1;
            }
        }
            System.out.println("Количество чисел оканчивающихся на 0 = " + summ);

        int summ2 = 0;
        for (int d :array) {
            if (d % 10 == 0) {
                summ2 = summ2 +d;
            }
        }
        System.out.println("Сумма чисел оканчивающихся на 0 = "+ summ2);


    }
}
