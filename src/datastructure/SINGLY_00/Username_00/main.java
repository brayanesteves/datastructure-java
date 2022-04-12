package datastructure.SINGLY_00.Username_00;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Esteves [brayan.esteves93@gmail.com]
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List list = new List();
        int Option = 0;
        String Username;
        do {
            try {
                Option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                          "1. Add item init to list\n "
                        + "2. Add item final to list\n "
                        + "3. Remove item init to list\n "
                        + "4. Remove item final to list\n "
                        + "5. Remove item specific to list\n "
                        + "6. Search item specific to list\n "
                        + "7. Show data list\n "
                        + "8. Exit", 
                        "Menu option"));
                
                switch(Option) {
                    case 1:
                        try {
                            Username = JOptionPane.showInputDialog(null, "Enter username:", "Add init", 3);
                            /**
                             * Add init to 'node'
                             */
                            list.addInit(Username);
                        } catch(StringIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        break;
                        
                    case 2:
                        try {
                            Username = JOptionPane.showInputDialog(null, "Enter username:", "Add init", 3);
                            /**
                             * Add final to 'node'
                             */
                            list.addFinal(Username);
                        } catch(StringIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        break;
                        
                    case 3:
                        Username = list.deleteInit();
                        JOptionPane.showMessageDialog(null, 
                                "Item delete: " + Username, 
                                "Delete node init", 
                                JOptionPane.INFORMATION_MESSAGE);                        
                        break;
                    
                    case 4:
                        Username = list.deleteFinal();
                        JOptionPane.showMessageDialog(null, 
                                "Item delete: " + Username, 
                                "Delete node final", 
                                JOptionPane.INFORMATION_MESSAGE);                        
                        break;
                        
                    case 5:
                        Username = JOptionPane.showInputDialog(null, 
                                "Enter username delete...", 
                                "Delete item specific", 
                                JOptionPane.INFORMATION_MESSAGE);
                        if(list.existList(Username)) {
                            list.deleteNode(Username);
                            JOptionPane.showMessageDialog(null, 
                                    "Item delete: " + Username, 
                                    "Delete node", 
                                    JOptionPane.INFORMATION_MESSAGE); 
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                "Item: " + Username, 
                                "No exist", 
                                JOptionPane.WARNING_MESSAGE); 
                        }
                        
                        break;
                        
                    case 6:
                        Username = JOptionPane.showInputDialog(null, 
                                "Enter username search...", 
                                "Search item specific", 
                                JOptionPane.INFORMATION_MESSAGE); 
                        if(list.existList(Username)) {
                            JOptionPane.showMessageDialog(null, 
                                "Item: " + Username, 
                                "Exist", 
                                JOptionPane.INFORMATION_MESSAGE); 
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                "Item: " + Username, 
                                "No exist", 
                                JOptionPane.WARNING_MESSAGE); 
                        }
                        
                        break;
                        
                    case 7:
                        list.getList();
                        break;
                        
                    case 8:
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Option incorrect");
                        break;
                }
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while(Option != 8);
    }
    
}
