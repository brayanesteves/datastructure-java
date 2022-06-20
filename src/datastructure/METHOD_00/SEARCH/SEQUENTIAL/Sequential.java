package datastructure.METHOD_00.SEARCH.SEQUENTIAL;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class Sequential {
            
    int index;
    int position;
    int temporal;
    int count;
    
    public Sequential() {
        this.index    = 0;
        this.position = 0;
        this.temporal = 0;
    }
    
    public int searchSequential(int array[], int item) {
        boolean find = false;
        for(this.index = 0; this.index < array.length && find == false; this.index++) {
            if(item == array[this.index]) {
                find = true;
                return this.index;
            }
        }
        
        return -1;
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
