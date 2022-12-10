package lesson5.constructors;

public class Person {
    private String name;
    private int age;

    Person() {
        System.out.println("Hello from constructor");

        this.name = "Безымянный";
        this.age = 0;
    }

    Person(String name) {
        System.out.println("Hello from constructor with one parameter");
        this.name = name;
        this.age  =10;
    }

    public Person(int age) {
        this.age = age;
    }

    Person(String name, int age) {
        System.out.println("Hello from constructor with two parameters");

        this.name  = name;
        this.age = age;
    }


    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name; // this обращается к глобальной переменной

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {  // toString выводит св-ва объекта
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
