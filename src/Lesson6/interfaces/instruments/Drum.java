package Lesson6.interfaces.instruments;

public class Drum implements Instrument{
    int size;

    @Override
    public void play() {
        System.out.println(" Drum bass "+size);
    }
}
