package datastructure.RECURSION_00.Factorial_00;

/**
 *
 * @author brayan
 */
public class Factorial {
    
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }
}
