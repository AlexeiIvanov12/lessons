package Lesson6.modificators.p2;

import Lesson6.modificators.p1.A; // появился потому что д -в другом пакете

public class D {
    void test() {
        A a = new A(); // если класс не наследник - не extends тогда создам объект класса А
        System.out.println(a.publicVariable);
        a.publicMethod();

//        System.out.println(a.privateVariable); // private доступны напряму только внутри класаа
//        a.privateMethod();

//        System.out.println(a.defaultVariable);
//        a.defaultMethod();

//        System.out.println(a.protectedVariable);
//        a.protectedMethod();

    }
}
