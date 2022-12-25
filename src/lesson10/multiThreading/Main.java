package lesson10.multiThreading;

import lesson10.multiThreading.A;
import lesson10.multiThreading.D;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        A a = new A();
        Thread threadA = new Thread(a);
        threadA.start();

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Hello from thread B");
            }
        });
        threadB.start();

        Thread threadC =new Thread(()-> System.out.println("Hello from thread C"));
        threadC.start();

        D threadD =new D();
        threadD.start();


        if (threadD.isAlive()) {
            System.out.println("Thread D is Alive");
        } else {
            System.out.println("Thread D is Dead");
        }


        threadD.join();
        System.out.println("After thread D");

        System.out.println("Hello from main thread\n");

        for (int i=3; i>=1; i--) {
            Thread.sleep(1000);
            System.out.println("Programm exit: " +i +"c");
        }



    }
}
