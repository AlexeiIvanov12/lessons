package lesson4.encapsultion;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        Engine engine = new Engine();
//        bmw.engine =engine;
        bmw.setEngine(engine);
        bmw.go();
    }
}
