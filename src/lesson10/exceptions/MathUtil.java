package lesson10.exceptions;

import Lesson6.modificators.p1.C;

public class MathUtil {
    public static int divide(int number1, int number2) throws CheckedArithmeticException, NegativeResultException {
        if (number2 ==0) {
//            throw new ArithmeticException("на ноль делить нельзя"); //throw - выбросить (ошибку)
            throw new CheckedArithmeticException("На ноль делить нельзя");
        }

        int result= number1/number2;
        if (result <0) {
            throw new NegativeResultException("Рузальтат не может быть отрицательным");
        }

        return result;

    }
}
