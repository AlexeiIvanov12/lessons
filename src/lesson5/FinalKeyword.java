package lesson5;

public class FinalKeyword {
    static int MY_INTEGER=1;

    public static void main(String[] args) {
        System.out.println(MY_INTEGER);

        final double PI = 3.14; // final делает переменную неизменяемой
//        System.out.println("Pi =" +PI);

        System.out.println("Hello world!");

    }
    static void printConstant(final String constant) {
//        constant = "modified";
        System.out.println("Constant: " +constant);
    }
}
