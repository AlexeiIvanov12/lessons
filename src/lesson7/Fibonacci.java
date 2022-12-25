package lesson7;

public class Fibonacci {
    public static void main(String[] args) {
        long beforeForRecursion  = System.currentTimeMillis();
        System.out.println(calculateFibonacciByRecursion(40));
        long afterForRecursion  = System.currentTimeMillis();
        System.out.println("Time " + (afterForRecursion - beforeForRecursion));

        System.out.println();


        long beforeForLoop  = System.currentTimeMillis();
        System.out.println(calculateFibonacciByLoop(40));
        long afterForLoop  = System.currentTimeMillis();
        System.out.println("Time " + (afterForLoop - beforeForLoop));

    }
    private static long calculateFibonacciByRecursion(int n) { // алгоритм через рекурсию
        if (n==0 || n == 1) {
        return n;
    }
        return calculateFibonacciByRecursion(n - 1) + calculateFibonacciByRecursion(n - 2);
}
private static long calculateFibonacciByLoop(int n) { // алгоритм через массив он быстрее
        long [] fibNumbers = new long[n+2];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;

        for (int i =2; i<=n; i++) {
        fibNumbers[i]  = fibNumbers[i-1] + fibNumbers[i-2];
        }
        return fibNumbers[n];
}
}
