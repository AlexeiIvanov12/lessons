package Lesson6.interfaces.printingHouse;

public class Book implements Printable{
    String autor;



    @Override
    public void print() {
        System.out.println("книга "+autor);
    }
    static void printBooks(Printable[] printables) {
        for (int i =0; i< printables.length;i++) {
            if (printables[i] instanceof Book){
                printables[i].print();
        }

    }
}}
