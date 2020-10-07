package edu.ginger.hacker;

/**
 * @author dlevchuk
 * @since 1.0
 **/
public class FibonacciSequence {

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
