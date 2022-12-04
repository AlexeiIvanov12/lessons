package lesson3;

import java.util.Random;

public class Array {
    public static void main(String[] args) {

    }

    public static class Arrays{

        public static void main(String[] args) {

    //        int [] intArray = new int[5];
    //        System.out.println(intArray[0]);
    //        System.out.println(intArray.length + "\n");



    //        intArray [1] = 10;
    //        intArray [2] = 20;
    //        intArray [3] = 30;
    //        intArray [4] = 40;

    //        for (int i = 0; i< intArray.length;i++){
    //            intArray[i] = i*10;
    //        }
    //
    //        for (int i=0; i< intArray.length;i++) {
    //
    //            System.out.println(intArray[i]);
    //        }
    //            int[] intArray2 = new int[] {1, 2, 3};
    //        for (int i = 0; i < intArray2.length; i++) {
    //            System.out.println(intArray2[i]);
    //        }
    //        String [] seasons = new String[] {"Winter", "Spring","Summer","Autumn" };
    //
    ////        Цикл for
    //        for (int i = 0; i <seasons.length; i++)
    //        System.out.println(seasons[i]);
    //        System.out.println();
    //
    ////        Цикл for-each
    //        for (String season: seasons) {
    //            System.out.println(season);
    //        }
    //        найти минимальное число в массиве сл/ чисел, размером 10, макс сл число 99
//            Random rand =new Random();
//            int [] array = new int[10];
//            for (int i =0; i< array.length; i++) {
//            array [i] = rand.nextInt(99);
//            System.out.print(array [i] + " ");
//
//        }
//            System.out.println();
//
//            int min = 99;
//            for (int x:array) {
//                if (x<min) {
//                    min =x;
//                }
//            }
//            System.out.print(min);


/*   Двумерный массив:
            1,2,3
            4,5,6
            Обращение к элементам двумерного массива :<название массива>[a][b], где а - индекс строки b- индекс столбца

 */


         //int [][] twoDimensionalArray = new int[2][3] ;
            int [][] twoDimensionalArray =  {{1,2,3},{4,5,6}};



         int t =1;
         for (int i=0;i< twoDimensionalArray.length; i++ ){
             for (int j=0; j<twoDimensionalArray[i].length; j++){

                 System.out.print(twoDimensionalArray[i][j]+ " " );
             }
             System.out.println();
         }
            System.out.println();

         for (int[] oneDimensialArray: twoDimensionalArray) {
             for (int number : oneDimensialArray) {
                 System.out.println(number + " ");
             }
             System.out.println();
         }





        }}
}
