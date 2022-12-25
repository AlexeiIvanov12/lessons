package Lesson6.abstractclasses;

import Lesson6.modificators.p1.A;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.weight = 3.4;
        dog.say();

        Animal cat = new Cat();
        cat.weight = 3.4;
        cat.say();

//        Animal animal = new Animal();
//        animal.say();
    }
}
