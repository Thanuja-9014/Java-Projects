package balaji;

public class FibonacciWithoutDp {

    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int count = 10; // Print first 10 Fibonacci numbers
        System.out.println("Fibonacci sequence without DP:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
