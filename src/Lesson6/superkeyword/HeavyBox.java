package Lesson6.superkeyword;

public class HeavyBox extends  Box{
    private double weight;

    public HeavyBox(double width, double height, double depth, double weight) {
        super(width, height, depth); // всегда первой строкой вызывает конструкторы супер класса
        this.weight = weight;
    }

    public HeavyBox() {
        super(); // если  супер не заявлен явно - он добавляется автоматом без параметров
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
//        System.out.println(super.toString()); // супер обращается к методам супер класса
        return "HeavyBox{" +
                "width=" + getWidth() +
                "height=" + getHeight()+
                "depth=" + getDepth()+
                "weight=" + getWeight()+
                "weight ="+ weight +
                '}';
    }


}
