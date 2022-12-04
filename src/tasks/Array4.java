package tasks;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {

        Random rand =new Random();
//        int [][] array = new int[34][3];
//        for (int i=0; i< array.length; i++) {
//            for (int j=0; j< (array[i].length);j++) {
//                if (i > 33 && j>1) {
//                    break;
//                }
//                    array[i][j] = rand.nextInt(10000);
//
//
//
//                System.out.print(array [i][j]+ " ");
//            }
//            System.out.println();
//        }

        int [] array = new int[100];
        for (int i =0; i< array.length;i++) {
            array [i] = rand.nextInt(10000);
            System.out.print(array [i] + " ");
        }
        System.out.println();
        int r=0;
        int sum = 0;
        int idx =0;
        for (int i = 0; i+2 < array.length; i++) {
            for (int j =0; j<i+3 ;j++) {
                sum = sum+ array[j];
            }

//            if ((array[i] + array[i + 1] + array[i + 2]) > sum) {
//                sum = (array[i] + array[i + 1] + array[i + 2]);

                r = array[i];
                idx = i;



            }
        System.out.println("Максимальная сумма трех соседних чисел "+sum + " первое из этих чисел "+""+ r);
        System.out.println("Индекс первого числа из тройки "+ idx);
        if (r >1000) {
            System.out.println("Первое значение первого числа "+ r / 1000);
        }
        else if (r>100) {
            System.out.println("Первое значение первого числа "+r / 100);
        }
        else if (r>10) {
            System.out.println("Первое значение первого числа "+r / 10);
        }
        else {
            System.out.println("Первое значение первого числа "+r);
        }





    }
}
