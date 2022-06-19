package datastructure.ALGORITHM_00.SORTING_00.QUICK;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class Quick {
    
    int index;
    int position;
    int temporal;
    int count;
    
    public Quick() {
        this.index    = 0;
        this.position = 0;
        this.temporal = 0;
    }
    
    /**
     * 
     * @param array
     * @param first
     * @param last 
     */
    public void quick(int[] array, int first, int last) {
        int i;
        int j;
        int pivot;
        int auxiliary;
        
        i = first;
        j = last;
        
        pivot = array[(first + last) / 2];
        
        do {
            while(array[i] < pivot) {
                i++;
            }
            
            while(array[j] > pivot) {
                j--;
            }
            
            if(i <= j) {
                auxiliary = array[i];
                array[i]  = array[j];
                array[j]  = auxiliary;
                i++;
                j--;
            }
        } while(i <= j);
        
        if(first < j) {
            this.quick(array, first, j);
        }
        
        if(i < last) {
            this.quick(array, i, last);
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
