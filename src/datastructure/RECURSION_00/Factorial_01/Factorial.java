package datastructure.RECURSION_00.Factorial_01;

/**
 *
 * @author brayan
 */
public class Factorial {
       
    public int factorial(int n) {
        if(n < 0) {
            return 0;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }
    
    public int factorialIterate(int n) {
        int factor = 1;
        if(n < 0) {
            return 0;
        } else {
            while(n != 0) {
                factor = n * factor;
                n--;
            }
            return factor;
        }
    }
}
