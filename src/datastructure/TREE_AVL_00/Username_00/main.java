package datastructure.TREE_AVL_00.Username_00;

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
        TreeBitAVL treeBitAVL = new TreeBitAVL();
        
        try {
            
            do {
                Option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                          "1. Add node\n"
                        + "2. Iterate tree 'inOrder'\n"
                        + "3. Iterate tree 'preOrder'\n"
                        + "4. Iterate tree 'postOrder'\n"
                        + "5. Search node in the tree\n"
                        + "6. Delete node in the tree\n"
                        + "7. Exit", 
                        "Menu option"));
                switch(Option) {
                    case 1:
                        try {
                            item = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number node:", "Add node...", JOptionPane.INFORMATION_MESSAGE));                            
                            treeBitAVL.add(item);                            
                        } catch(StringIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        break;
                        
                    case 2:
                        if(!treeBitAVL.isEmpty()) {
                            treeBitAVL.inOrder(treeBitAVL.getRoot());
                        } else {
                            JOptionPane.showInputDialog(null, "Tree Bit empty");
                        }
                        break;
                        
                    case 3:                        
                        if(!treeBitAVL.isEmpty()) {
                            treeBitAVL.preOrder(treeBitAVL.getRoot());
                        } else {
                            JOptionPane.showInputDialog(null, "Tree Bit empty");
                        } 
                        break;
                    
                    case 4:
                        if(!treeBitAVL.isEmpty()) {
                            treeBitAVL.postOrder(treeBitAVL.getRoot());
                        } else {
                            JOptionPane.showInputDialog(null, "Tree Bit empty");
                        }      
                        break;
                        
                    case 5:
                                 
                        break;
                        
                    case 6:                        
                        if(!treeBitAVL.isEmpty()) {
                            item = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                    "Enter number node at delete:", "Delete node...", 
                                    JOptionPane.INFORMATION_MESSAGE)); 
                            if(!treeBitAVL.delete(item)) {
                                JOptionPane.showMessageDialog(null, "Node [" + item + "] not exist in the tree");
                            } else {
                                JOptionPane.showMessageDialog(null, "Node [" + item + "] exist in the tree, data is " + treeBitAVL.delete(item));
                            }
                        } else {
                            JOptionPane.showInputDialog(null, "Tree Bit empty");
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
