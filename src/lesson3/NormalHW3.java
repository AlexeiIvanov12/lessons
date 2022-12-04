package lesson3;

public class NormalHW3 {
    public static void main(String[] args) {

    int [][] array = new int[10][10];


    for (int i = 1; i< array.length; i++) {
        for (int j = 1; j< array[i].length; j++) {
             array[i][j] = i;

            System.out.print(array[i][j] *j + " ");
        }
        System.out.println();
    }


    }
}
