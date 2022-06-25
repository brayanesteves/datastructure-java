package datastructure.RECURSION_00.Factorial_01;

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
        int number = 4;
        Factorial factorial = new Factorial();
        
        JOptionPane.showMessageDialog(null, "Factorial of " 
                + number 
                + ". Using the recursive method is " + factorial.factorial(number));
        
        JOptionPane.showMessageDialog(null, "Factorial of " 
                + number 
                + ". Using the recursive method iterate is " + factorial.factorialIterate(number));
    }
    
}
