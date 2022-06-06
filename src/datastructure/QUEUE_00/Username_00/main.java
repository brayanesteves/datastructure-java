package datastructure.QUEUE_00.Username_00;

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
        Queue queue = new Queue();
        int Option = 0;
        String Username;
        do {
            try {
                Option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                          "1. Insert an element in the Queue\n "
                        + "2. Remove an item from the Queue\n "
                        + "3. Is the queue empty?\n "
                        + "4. Item located at the beginning of the Queue\n "
                        + "5. Queue size\n "
                        + "6. Exit\n ",
                        "Menu option"));
                
                switch(Option) {
                    case 1:
                        try {
                            Username = JOptionPane.showInputDialog(null, "Enter username:", "Add init", 3);
                            /**
                             * Add init to 'node'
                             */
                            queue.add(Username);
                        } catch(StringIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        break;
                        
                    case 2:
                        try {
                            if(!queue.isEmpty()) {
                            Username = queue.delete();
                            JOptionPane.showMessageDialog(null, 
                                "Item delete: " + Username, 
                                "Delete node init", 
                                JOptionPane.INFORMATION_MESSAGE);  
                        } else {
                            JOptionPane.showMessageDialog(null, "No exist node");
                        }     
                        } catch(StringIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        break;
                        
                    case 3:
                        if(!queue.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No queue empty");
                        } else {
                            JOptionPane.showMessageDialog(null, "Queue empty");
                        }  
                                         
                        break;
                    
                    case 4:
                        if(!queue.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Item located at the beginning of the Queue is: " + queue.initQueue());
                        } else {
                            JOptionPane.showMessageDialog(null, "Queue empty");
                        }         
                        break;
                        
                    case 5:                        
                        if(!queue.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Queue size is: " + queue.size());
                        } else {
                            JOptionPane.showMessageDialog(null, "Queue empty");
                        }  
                        break;
                        
                    case 6:
                        
                        
                        break;  
                        
                    case 9:
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Option incorrect");
                        break;
                }
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while(Option != 6);
    } 
    
}
