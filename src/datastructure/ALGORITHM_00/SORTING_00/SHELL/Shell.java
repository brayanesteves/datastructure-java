package datastructure.ALGORITHM_00.SORTING_00.SHELL;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class Shell {
        
    int index;
    int position;
    int temporal;
    int count;
    
    public Shell() {
        this.index    = 0;
        this.position = 0;
        this.temporal = 0;
    }
    
    public void shell(int[] array) {
        int skip;
        int k; 
        int auxiliary;
        
        skip = array.length / 2;
        
        while(skip > 0) {
            for(this.index = skip; this.index < array.length; this.index++) {
                this.position = this.index - skip;
                while(this.position >= 0) {
                    k = this.position + skip;
                    if(array[this.position] <= array[k]) {
                        this.position = -1;
                    } else {
                        auxiliary            = array[this.position];
                        array[this.position] = array[k];
                        array[k]             = auxiliary;
                        this.position       -= skip;
                    }
                }
            }
            skip = skip / 2;
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
