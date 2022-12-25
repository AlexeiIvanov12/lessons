package lesson7;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }
    private static long calculateFactorial(int n) {
        if (n==0 || n == 1) {
            return 1;
        }

            return n * calculateFactorial(n - 1);
        }

    }



