package Lesson6.interfaces.instruments;

public class Main {
    public static void main(String[] args) {


    Guitar guitar = new Guitar();
    Drum drum = new Drum();
    Trumpet trumpet = new Trumpet();


    Instrument[] array = new Instrument[]{guitar,drum,trumpet};
    for (int i=0; i<array.length; i++) {
        array[i].play();
    }


    }


}
