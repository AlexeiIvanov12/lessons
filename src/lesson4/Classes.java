package lesson4;

public class Classes {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Вася";
        person.age = 30;

        person.sayHello();
        person.speak();

        Person person2 = new Person();
//        person2.name = "Alex";
//        person2.age = 45;

//        person2.setName("Alex");
//        person2.setAge(45);

        person2.setNameAndAge("Alex", 45);

        person2.sayHello();
        person2.speak();
        person2.calculateToYearsToRetirement();

        int yearsToRetirement = person2.calculateToYearsToRetirement();
        System.out.printf("Осталось %d лет до выхода на пенсию \n");


       Student student = new Student();
       student.name = "Иван";
       student.course = "Java";

        System.out.printf("студент %s учится на курсе %s", student.getName(), student.getCourse());


    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("Hello from class Test");
    }
}

class Test2 {
    public static void main(String[] args) {
        System.out.println("Hello from class test2");
    }
}

class Person {
    //    свойства
    String name;
    int age;

    //    методы
    void speak() {
//        System.out.println("Меня зовут " + name+ ", мне " + age + "лет");
        System.out.printf("Меня зовут %s, мне %d лет \n", name, age);
    }

    void sayHello() {
        System.out.println("привет!");
    }

    int /*void*/ calculateToYearsToRetirement() { //void -ничего не возвращает, int возвращает целое число
//        int yearsToRetirement = 65 - age;
//        System.out.printf("Осталось %d до выхода на пенсию \n",yearsToRetirement );

        return 65 - age;

    }

    void setName(String n) {
        name = n;
    }

    void setAge(int a) {
        age = a;
    }

    void setNameAndAge(String n, int a) {
        name = n;
        age = a;
    }

    public void talk() {
    }
}

//    написать класс студент предоставляющий информацию о имени методом гетнаме и курсе методом геткурс

class Student {
    String name;
    String course;




    String getName(){
        return name;
        }
        String getCourse() {
            return course;
            }




}
