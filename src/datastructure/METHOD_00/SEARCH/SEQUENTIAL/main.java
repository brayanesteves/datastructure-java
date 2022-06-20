package datastructure.METHOD_00.SEARCH.SEQUENTIAL;

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
        Sequential sequential = new Sequential();
        int[] array           = {22, 5, 48, 9, 0, 1, 22, 21, 3};
        
        sequential.getArray(1, 0, array);
        int itemSearch = 9;
        int index = sequential.searchSequential(array, itemSearch);
        if(index != -1) {
            JOptionPane.showMessageDialog(null, "Item " + itemSearch + " found it's index " + index);
        } else {
            JOptionPane.showMessageDialog(null, "Item " + itemSearch + " not found");
        }
    }
    
}
