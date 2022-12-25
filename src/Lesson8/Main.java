package Lesson8;

public class Main {
    public static void main(String[] args) {
       LinkedList alphabet = new LinkedList();

       alphabet.addLast("B");
       alphabet.addLast("C");
       alphabet.addLast("D");
       alphabet.addLast("E");
        System.out.println("Alphabet: "+ alphabet);

        alphabet.addFirst("A");
        System.out.println("Alphabet: "+alphabet);
    }
}
