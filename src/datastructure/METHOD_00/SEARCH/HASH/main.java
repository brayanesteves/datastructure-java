package datastructure.METHOD_00.SEARCH.HASH;

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
        Hash hash      = new Hash(8);
        String[] items = {"22", "33", "21", "10", "12", "14", "56", "100"};
        
        hash.functionHash(items, hash.array);
        hash.show();
        
        String search = hash.searchKey("33");
        if(search == null) {
            JOptionPane.showMessageDialog(null, "Item not found in the table");
        } else {
            JOptionPane.showMessageDialog(null, "Item found in the table");
        }
    }
    
}
