package Lesson6.interfaces.instruments;

public class Guitar implements Instrument {
    int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Guitar play "+ numberOfStrings);
    }
}
