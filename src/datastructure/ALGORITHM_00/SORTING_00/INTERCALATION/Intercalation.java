package datastructure.ALGORITHM_00.SORTING_00.INTERCALATION;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class Intercalation {
            
    int index;
    int position;
    int temporal;
    int count;
    
    public Intercalation() {
        this.index    = 0;
        this.position = 0;
        this.temporal = 0;
    }
    
    public void intercalation(int array_A[], int[] array_B) {
        int k;
        int[] array_C = new int[array_A.length + array_B.length];
        
        /**
         * Repeat while arrays A and B have items to compare
         */
        for(this.index = this.position = k = 0; this.index < array_A.length && this.position < array_B.length; k++) {
            if(array_A[this.index] < array_B[this.position]){
                array_C[k] = array_A[this.index];
                this.index++;
            } else {
                array_C[k] = array_B[this.position];
                this.position++;
            }
        }
        
        /**
         * Add elements to "array C" of "array A" if there are leftovers
         */
        for(; this.index < array_A.length; this.index++, k++) {
            array_C[k] = array_A[this.index];
        }
        
                
        /**
         * Add elements to "array C" of "array B" if there are leftovers
         */
        for(; this.position < array_B.length; this.position++, k++) {
            array_C[k] = array_B[this.position];
        }
        
        this.getArray(1, 1, array_C);
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
