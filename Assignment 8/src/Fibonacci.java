import java.util.Scanner;

public class Fibonacci {

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 0;

        for (int i = 2; i <= n; i++) {
            int newFib = fib + prevFib;
            prevFib = fib;
            fib = newFib;
        }
        return fib;
    }

    
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to compute Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci number (Iterative) of " + n + " is: " + fibonacciIterative(n));
        System.out.println("Fibonacci number (Recursive) of " + n + " is: " + fibonacciRecursive(n));

        scanner.close();
    }
}
