package datastructure.METHOD_00.SEARCH.BIT;

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
        Bit bit = new Bit();
        int[] array           = {22, 5, 48, 9, 0, 1, 22, 21, 3};
        
        bit.getArray(1, 0, array);
        bit.naturalBlend(array);
        bit.getArray(1, 1, array);
        
        int itemSearch = 9;
        int index = bit.searchBit(array, itemSearch);
        
        if(index != -1) {
            JOptionPane.showMessageDialog(null, "Item " + itemSearch + " found it's index " + index);
        } else {
            JOptionPane.showMessageDialog(null, "Item " + itemSearch + " not found");
        }
    }
    
}
