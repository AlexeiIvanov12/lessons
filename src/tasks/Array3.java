package tasks;
import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        int [][] array = new int[12][8];
        Random rand = new Random();
        for (int i=0; i< array.length; i++) {
            for (int j=0; j< array[i].length; j++){
                array [i][j] = rand.nextInt(50);
                System.out.print(array[i][j] + " ");
        }
            System.out.println();

        }
        int maxSum  =0;
        int maxSumIdx = 0;
        for (int i =0; i< array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }

        }
            System.out.println("Индекс строки с максимальной суммой элементов -  "+ maxSumIdx);



    }
}
