package Lesson6.interfaces.instruments;

public class Trumpet implements Instrument{

int diameter;

    @Override
    public void play() {
        System.out.println("Trumpet play "+ diameter);

    }
}
