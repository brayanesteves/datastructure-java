package datastructure.RECURSION_00.Factorial_00;

import java.util.Scanner;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = input.nextInt();
        
        Factorial factorial = new Factorial();

        System.out.println("Factorial number " + number + " is: " + factorial.factorial(number));
    }
    
}
