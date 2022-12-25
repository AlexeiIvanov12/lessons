package lesson7;

public class Recursion {
    public static void main(String[] args) {
       int sum = counter(3);
        System.out.println(sum);

    }
//    recursionMethod() -> recursionMethod() -> ... recursionMethod()

    static void recursionMethod() {
        System.out.println("It is recursive method");
        recursionMethod();
    }
// timer(5) -> timer(4) -> .. ->timer(0)- > timer(-1) -> end
    static void timer(int n) {
        if (n >= 0) {
            System.out.println(n);
            timer(n - 1);
        }
    }
    // counter(3)- > counter(2) ->
    static int counter(int n) {
        if (n==0) {
            return 0;
        }

        int sum = n + counter(n-1);
        return sum;
    }
}
