package datastructure.CIRCLE_00.Username_00;

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
        List list = new List();
        int Option = 0;
        String Username;
        boolean removed = false;
        do {
            try {
                Option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                          "1. Add item\n "
                        + "2. Remove item\n "
                        + "3. Search item specific to list\n "
                        + "4. Show data list\n "
                        + "5. Exit", 
                        "Menu option"));
                
                switch(Option) {
                    case 1:
                        try {
                            Username = JOptionPane.showInputDialog(null, "Enter username:", "Add init", 3);
                            /**
                             * Add init to 'node'
                             */
                            list.add(Username);
                        } catch(StringIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        break;
                        
                    case 2:
                        if(!list.isEmpty()) {
                            Username = JOptionPane.showInputDialog(null, "Enter username to delete:", "Delete node list circle", JOptionPane.INFORMATION_MESSAGE);
                            /**
                             * Delete init to 'node'
                             */
                            removed = list.delete(Username);
                            if(removed) {
                                JOptionPane.showMessageDialog(null, "Item " + Username + " removed");
                            } else {
                                JOptionPane.showMessageDialog(null, "Item not exist");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No exist node");
                        }
                        break;
                        
                    case 3:
                      
                        break;
                    
                    case 4:
                        if(!list.isEmpty()) {
                            list.getList();
                        } else {
                            JOptionPane.showMessageDialog(null, "No exist node");
                        }
                        break;
                        
                    case 5:
 
                        break;                        
                   
                    default:
                        JOptionPane.showMessageDialog(null, "Option incorrect");
                        break;
                }
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while(Option != 5);
    }    
}
