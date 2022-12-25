package Lesson6.interfaces.printingHouse;

public class Magazine implements Printable {
    String name;

    @Override
    public void print() {
        System.out.println("Журнал " + name);


    }

    static void printMagazines(Printable[] printables) {


        for (int i = 0; i < printables.length; i++) {
           if (printables[i] instanceof Magazine){
               printables[i].print();
           }

        }

    }

}

