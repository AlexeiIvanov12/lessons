package lesson4.encapsultion;

public class Car {
    private Engine engine;
    void go(){
//         сначала заустить двигатель? затем машине едет
        engine.start();

        System.out.println("Going car");
    }
    Engine getEngine() {
        return engine;
    }

    void setEngine(Engine e) {
        engine =e;
    }
}
