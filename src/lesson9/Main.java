package lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList alphabet = new ArrayList();
//        alphabet.add("B");
//        alphabet.add("C");
//        alphabet.add("D");
//
//        alphabet.add(0,"A");
//
//        ArrayList letters =new ArrayList();
//        letters.add("E");
//        letters.add("F");
//
//        alphabet.addAll(letters);
//
//        alphabet.add(4,"M");
//        alphabet.set(5,"S");
//
////        int indexF =alphabet.indexOf("F");
////        alphabet.remove(indexF);
//
//        alphabet.remove("F");
//
//
//        System.out.println(alphabet);
//        System.out.println(alphabet.get(3));
//        System.out.println(alphabet.size());
//
//        if (alphabet.contains("M")) {
//            System.out.println("в динамическом массиве есть буква М");
//        } else{
//            System.out.println("в динамическом массиве нет буква М");
//        }

//        ArrayList<Number> numbers = new ArrayList<>(); // <int> Дженерики мы параметризируем массив чтобы были только числа
////
////       ArrayList<Object> list = new ArrayList<>(); //- будет хранить все типы данных
////
////        list.add(1);
////        list.add(2);
////        list.add(3);
////        list.add(4);
////        list.add("Rabbit");
////
////        System.out.println("Numbers:");
////        for (Object element : list) {
////            if (element instanceof Integer) {
////                System.out.print(element + " ");
////            }
////        }
////            System.out.println();
//
//
//        //System.out.println("Numbers: " + numbers);
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3.5);
//
//        System.out.println(numbers);
//        LinkedList<String> names = new LinkedList<>();
//
//        names.add("Dima");
//        names.add("Leha");
//        names.add("Egor");
//        names.add("Areg");
//
//        names.add(0, "Murad");
//        names.addFirst("Julia");
//
//        System.out.println(names);

//        ArrayDeque<Integer> numbers  =new ArrayDeque<>();
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//
//        System.out.println(numbers);
//
//        System.out.println(numbers.peek());
//
//        System.out.println(numbers);
Set<Student> students  = new LinkedHashSet<>();


        Student student1 = new Student();
        student1.setName("Bob");

        Student student2 = new Student();
        student2.setName("Bob");

        students.add(student1);
        students.add(student2);

        System.out.println("Same students: " + student1.equals(student2));
        System.out.println("Students: "+ students);






    }
}
