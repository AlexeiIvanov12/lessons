package Lesson6.modificators.p2;

import Lesson6.modificators.p1.A; // появился потому что Е -в другом пакете

public class E extends A {
    void test() {
        System.out.println(publicVariable);
        publicMethod();

//        System.out.println(a.privateVariable); // private доступны напряму только внутри класаа
//        a.privateMethod();

//        System.out.println(defaultVariable);
//        defaultMethod();

        System.out.println(protectedVariable);
        protectedMethod();




    }
}
