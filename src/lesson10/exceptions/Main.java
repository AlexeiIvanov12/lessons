package lesson10.exceptions;

public class Main {
    public static void main(String[] args) {
//        System.out.println("8/4 = " +MathUtil.divide(8,4));


        try {
            System.out.println("8/4 = " + MathUtil.divide(8, 4));
        } catch (CheckedArithmeticException | NegativeResultException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("PING!!");
        }





        }
    }
