package datastructure.STACK_00.MEMORY.DYNAMIC_01;

import java.util.Stack;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("Hello");
        stack.add("World!");
        stack.add(" ");
        stack.add("Brayan");
        stack.add("Esteves");
        
        System.out.println("Size stack " + stack.size());
        System.out.println("================");
        System.out.println("The peak is: " + stack.peek());
        System.out.println("================");
        System.out.println("Exclude item of stack " + stack.pop());
        System.out.println("Exclude item of stack " + stack.pop());
        System.out.println("================");
        System.out.println("The peak is: " + stack.peek());
        System.out.println("================");
        System.out.println("Size stack " + stack.size());
        System.out.println("================");
        System.out.println("Is empty? " + (stack.empty() ? "Yes" : "No"));
    }
    
}
