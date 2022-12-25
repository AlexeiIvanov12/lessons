package Lesson6.homework.easy6;

public class Main {
    public static void main(String[] args) {
        Flower roses = new Roses();
        roses.country = "Russia";
        roses.daysBestBefore = 7;
        roses.price = 200;

        Flower tulips = new Tulips();
        tulips.country = "Holland";
        tulips.daysBestBefore = 4;
        tulips.price = 100;

        Flower carnations = new Сarnations();
        carnations.country = "Belarus";
        carnations.daysBestBefore = 6;
        carnations.price = 70;

        Flower[] array = new Flower[]{roses,tulips,carnations};
        for (int i=0; i<array.length; i++) {
            array[i].count();
            System.out.println(i);
        }



    }
}
