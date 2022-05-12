package datastructure.DOUBLE_00.Username_00;

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
        do {
            try {
                Option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                          "1. Add item init to list\n "
                        + "2. Add item final to list\n "
                        + "3. Remove item init to list\n "
                        + "4. Remove item final to list\n "
                        + "5. Remove item specific to list\n "
                        + "6. Search item specific to list\n "
                        + "7. Show data list 'Init' to 'Final'\n "
                        + "8. Show data list 'Final' to 'Init'\n "
                        + "9. Exit", 
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
                                               
                        break;
                    
                    case 4:
                                              
                        break;
                        
                    case 5:
                        
                        
                        break;
                        
                    case 6:
                        
                        
                        break;
                        
                    case 7:
                        if(!list.isEmpty()) {
                            list.getListInitFinal();
                        } else {
                            JOptionPane.showMessageDialog(null, "No exist node");
                        }                        
                        break;
                        
                    case 8:
                        if(!list.isEmpty()) {
                            list.getListFinalInit();
                        } else {
                            JOptionPane.showMessageDialog(null, "No exist node");
                        }                        
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
        } while(Option != 9);
    }    
    
}
