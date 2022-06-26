package datastructure.RECURSION_00.Fibonacci_00;

/**
 *
 * @author brayan
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if( n == 1 || n == 2) {
            return 1;
        } else {
            /**
             * Domain. [problem - 1]
             */
            return this.fibonacci(n - 1) + this.fibonacci(n - 2);
        }
    }
    
    public int fibonacciIterate(int n) {
        int fibonacci = 0;
        int first     = 1;
        int second    = 0; 
        while(n > 0) {
            fibonacci = first + second;
            first     = second;
            second    = fibonacci;
            n--;
        }
        return fibonacci;
    }
}
