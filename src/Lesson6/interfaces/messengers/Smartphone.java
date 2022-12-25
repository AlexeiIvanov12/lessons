package Lesson6.interfaces.messengers;

public class Smartphone {
    private Aplication aplication;

    public Aplication getAplication() {
        return aplication;
    }

    public void setAplication(Aplication aplication) {
        this.aplication = aplication;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "aplication=" + aplication +
                '}';
    }
}
