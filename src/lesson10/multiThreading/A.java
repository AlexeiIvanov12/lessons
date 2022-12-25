package lesson10.multiThreading;

public class A implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from thread A");
    }
}
