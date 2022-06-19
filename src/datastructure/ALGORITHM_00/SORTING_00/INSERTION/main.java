package datastructure.ALGORITHM_00.SORTING_00.INSERTION;

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
        int size;
        Insertion insertion = new Insertion();
        size                = Integer.parseInt(JOptionPane.showInputDialog(null, "Add size of array"));
        int[] array = new int[size];
        for(int index = 0; index < size; index++) {
            array[index] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter item of index " 
                    + index));
            insertion.insertion(array, index + 1);
        }
    }
    
}
