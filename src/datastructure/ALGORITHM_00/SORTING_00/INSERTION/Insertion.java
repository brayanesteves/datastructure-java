package datastructure.ALGORITHM_00.SORTING_00.INSERTION;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class Insertion {
        
    int index;
    int position;
    int temporal;
    int count;
    
    public Insertion() {
        this.index    = 0;
        this.position = 0;
        this.temporal = 0;
    }
    
    public void insertion(int[] array, int n) {
        int auxiliary;
        for(this.index = 1; this.index < n; this.index++) {
            auxiliary = array[this.index];
            this.position = this.index - 1;
            while(this.position >= 0 && array[this.position] > auxiliary) {
                array[this.position + 1] = array[this.position];
                this.position = this.position - 1;
            }
            array[this.position + 1] = auxiliary;
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
