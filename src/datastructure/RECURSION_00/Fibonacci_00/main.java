package datastructure.RECURSION_00.Fibonacci_00;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 12;
        Fibonacci fibonacci = new Fibonacci();
        
        JOptionPane.showMessageDialog(null, "The fibonacci sequence " 
                + number 
                + ". Using the recursive method is " + fibonacci.fibonacci(number));
        
        JOptionPane.showMessageDialog(null, "The fibonacci sequence " 
                + number 
                + ". Using the recursive method iterate is " + fibonacci.fibonacciIterate(number));
    }
    
}
