package datastructure.ALGORITHM_00.SORTING_00.REDIX;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class Redix {
    int index;
    int position;
    int temporal;
    int count;
    
    public Redix() {
        this.index    = 0;
        this.position = 0;
        this.temporal = 0;
    }
    
    public void redix(int[] array) {
        int x;
        int i;
        // Count
        int j;
        
        for(x = Integer.SIZE - 1; x >= 0; x--) {
            int auxiliary[] = new int[array.length];
            j = 0;
            for(i = 0; i < array.length; i++) {
                boolean move = array[i] << x >= 0;
                if(x == 0 ? !move : move) {
                    auxiliary[j] = array[i];
                    j++;
                } else {
                    array[i - j] = array[i];
                }
            }
                    
            /**
             * Copy in array auxiliary
             */
            for(i = j; i < auxiliary.length; i++) {
                auxiliary[i] = array[i - j];
            }
            
            array = auxiliary;
        }
        
        this.getArray(1, 1, array);
    }
    
    public void getArray(int activate, int option, int[] array) {
        int i = 0;
        String arrays = "";
        switch(activate) {
            case 0:                
                break;
                
            case 1:
                switch (option) {
                    case 0: 
                        for(i = 0; i < array.length; i++){
                            arrays += "[" + String.valueOf(array[i]) + "] ,";            
                        }
                        JOptionPane.showMessageDialog(null, arrays, "Original", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    case 1: 
                        for(i = 0; i < array.length; i++){
                            arrays += "[" + String.valueOf(array[i]) + "] ,";            
                        }
                        JOptionPane.showMessageDialog(null, arrays, "Sorting", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                        
                    default:
                        break;
                }
                break;
                
            default:
                break;
        }        
    }
}
