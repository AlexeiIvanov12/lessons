package lesson5.inheritence;

public class Dog extends Animal{

    int tailLength;

    public Dog(double weight, int tailLength) {
        super(weight);
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailLength=" + tailLength +
                '}';
    }

    void say() {
        System.out.println("Гаф- гаф");
    }


}
