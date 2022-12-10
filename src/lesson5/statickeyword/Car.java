package lesson5.statickeyword;

public class Car {
    static int numbersOfCars;

    String color;

    public Car(String color) {
        this.color = color;

        numbersOfCars++;
    }

}
