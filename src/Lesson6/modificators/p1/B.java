package Lesson6.modificators.p1;

public class B extends  A{
    void test() {
        System.out.println(publicVariable);
        publicMethod();

//        System.out.println(privateVariable); // private доступны напряму только внутри класаа
//        privateMethod();

        System.out.println(defaultVariable);
        defaultMethod(); // доступ есть только из того же паета

        System.out.println(protectedVariable);
        protectedMethod(); //доступ в том же пакете и в наследниках из других пакетов
    }
}
