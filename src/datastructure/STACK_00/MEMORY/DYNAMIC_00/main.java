
package datastructure.STACK_00.MEMORY.DYNAMIC_00;

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
        int Option = 0;
        int item = 0;
        Stack stack = new Stack();
        
        try {
            
            do {
                Option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                          "1. Push an element on the Stack\n "
                        + "2. Pop an element from the Stack\n "
                        + "3. Is the Stack empty?\n "
                        + "4. Which element is at the top?\n "
                        + "5. Size stack\n "
                        + "6. Truncate stack\n "
                        + "7. Exit", 
                        "Menu option"));
                switch(Option) {
                    case 1:
                        try {
                            item = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter item:", "Add init", JOptionPane.INFORMATION_MESSAGE));
                            stack.push(item);                            
                        } catch(StringIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        break;
                        
                    case 2:
                        try {
                            if(!stack.isEmpty()) {
                                JOptionPane.showMessageDialog(null, 
                                        "The item obtained is " + stack.pop(), 
                                        "Get data stack", 
                                        JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, 
                                        "Stack fill", 
                                        "The Stack filled", 
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                        } catch(StringIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        break;
                        
                    case 3:                        
                        if(stack.isEmpty()) {
                            JOptionPane.showMessageDialog(null, 
                                    "Stack empty", 
                                    "Stack empty", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "Stack not empty", 
                                    "Stack contain data", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }          
                        break;
                    
                    case 4:
                        if(!stack.isEmpty()) {
                            JOptionPane.showMessageDialog(null, 
                                    "The element at the top is " + stack.peak(), 
                                    "Peak stack", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "Stack is empty", 
                                    "Empty", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }        
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, 
                            "Size stack is " + stack.size(), 
                            "Size stack", 
                            JOptionPane.INFORMATION_MESSAGE);                  
                        break;
                        
                    case 6:                        
                        if(!stack.isEmpty()) {
                            stack.truncate();;
                            JOptionPane.showMessageDialog(null, 
                                    "Truncate stack", 
                                    "Truncate", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                    "Stack is empty", 
                                    "Empty", 
                                    JOptionPane.INFORMATION_MESSAGE);
                        }      
                        break;
                        
                    case 7:
                                            
                        break;                        
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Option incorrect");
                        break;
                }
            } while(Option != 7);
        } catch(NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
        }
    }
    
    
}
