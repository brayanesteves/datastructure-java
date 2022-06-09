package datastructure.TREE_00.Username_00;

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
        int item;
        String Name;
        TreeBit treeBit = new TreeBit();
        
        try {
            
            do {
                Option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                          "1. Add node\n"
                        + "2. Iterate tree 'inOrder'\n"
                        + "3. \n"
                        + "4. \n"
                        + "5. \n"
                        + "6. \n"
                        + "7. Exit", 
                        "Menu option"));
                switch(Option) {
                    case 1:
                        try {
                            item = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number node:", "Add node...", JOptionPane.INFORMATION_MESSAGE));
                            Name = JOptionPane.showInputDialog(null, "Enter name node...");
                            treeBit.add(item, Name);                            
                        } catch(StringIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        break;
                        
                    case 2:
                        if(!treeBit.isEmpty()) {
                            treeBit.inOrder(treeBit.root);
                        } else {
                            JOptionPane.showInputDialog(null, "Tree Bit empty");
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
