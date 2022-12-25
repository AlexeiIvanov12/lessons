package Lesson6.modificators.p1;

public class C {
    void test() {
        A a = new A(); // если класс не наследник - не extends тогда создам объект класса А
        System.out.println(a.publicVariable);
        a.publicMethod();

//        System.out.println(a.privateVariable);
//       a.privateMethod();

        System.out.println(a.defaultVariable);
        a.defaultMethod();

        System.out.println(a.protectedVariable);
        a.protectedMethod();

    }
}
