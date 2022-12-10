package lesson5.statickeyword;

import static java.lang.Math.*;
import static java.lang.Math.PI;

public class Main {
    int noStaticVariable =1;
    static int staticVariable = 2;

    public static void main(String[] args) {
        System.out.println(staticVariable);
        hello();

        Main main  = new Main();
        System.out.println(main.noStaticVariable);
    }
    static void hello(){
        System.out.println("Hello world!");

        Car orangeCar = new Car("orange");
        System.out.println("Number of cars: "+ Car.numbersOfCars);

        Car blueCar = new Car("blue");
        System.out.println("Number of cars: "+ Car.numbersOfCars);

        int result  =MathUtil.sum(2,3);
        System.out.println(result);

        System.out.println(PI);
        System.out.println("Синус 30 градусов = "+ sin(PI/6));
    }
}

