package datastructure.ALGORITHM_00.SORTING_00.NATURALBLEND;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class NaturalBlend {
            
    int index;
    int position;
    int temporal;
    int count;
    
    public NaturalBlend() {
        this.index    = 0;
        this.position = 0;
        this.temporal = 0;
    }
    
    public void naturalBlend(int array[]) {
        int     left           = 0;
        int     auxiliaryLeft  = 0;
        int     right          = array.length - 1;
        int     auxiliaryRight = right;
        boolean sort           = true;
        
        do {
            sort = true;
            left = 0;
            while(left < right) {
                auxiliaryLeft = left;
                /**
                 * Left
                 */
                while(auxiliaryLeft < right && array[auxiliaryLeft] <= array[auxiliaryLeft + 1]) {
                    auxiliaryLeft++;
                }
                
                /**
                 * Right
                 */
                auxiliaryRight = auxiliaryLeft + 1;
                while(auxiliaryRight == right - 1 || auxiliaryRight < right && array[auxiliaryRight] <= array[auxiliaryRight + 1]) {
                    auxiliaryRight++;
                }
                
                if(auxiliaryRight <= right) {
                    this.directBlend_v1(array);
                    sort = false;
                }
                left = auxiliaryLeft;
            }
        } while(!sort);
    }
        
    public int[] directBlend(int[] array) {
        int k;
        if(array.length > 1) {
            int n_ItemLeft  = array.length / 2;
            int n_ItemRight = array.length - n_ItemLeft;
            
            int arrayLeft[]  = new int[n_ItemLeft];
            int arrayRight[] = new int[n_ItemRight];
            
            /**
             * Copy item's 'arrayLeft'
             */
            for(this.index = 0; this.index < n_ItemLeft; this.index++) {
                arrayLeft[this.index] = array[this.index];
            }
            
                        
            /**
             * Copy item's 'arrayRight'
             */
            for(this.index = n_ItemLeft; this.index < n_ItemLeft + n_ItemRight; this.index++) {
                arrayRight[this.index - n_ItemLeft] = array[this.index];
            }
            
            /**
             * Recursive
             */
            arrayLeft  = this.directBlend(arrayLeft);
            arrayRight = this.directBlend(arrayRight);
            
            this.index    = 0;
            this.position = 0;
            k             = 0;
            
            while(arrayLeft.length != this.position && arrayRight.length != k) {
                if(arrayLeft[this.position] < arrayRight[k]) {
                    array[this.index] = arrayLeft[this.position];
                    this.index++;
                    this.position++;
                } else {
                    array[this.index] = arrayRight[k];
                    this.index++;
                    k++;
                }
            }
            
            /**
             * Array final 'array left'
             */
            while(arrayLeft.length != this.position) {
                array[this.index] = arrayLeft[this.position];
                this.index++;
                this.position++;
            }
            
                        /**
             * Array final 'array left'
             */
            while(arrayRight.length != k) {
                array[this.index] = arrayRight[k];
                this.index++;
                k++;
            }
        }
        return array;
    } 
        
    public void directBlend_v1(int[] array) {
        int k;
        if(array.length > 1) {
            int n_ItemLeft  = array.length / 2;
            int n_ItemRight = array.length - n_ItemLeft;
            
            int arrayLeft[]  = new int[n_ItemLeft];
            int arrayRight[] = new int[n_ItemRight];
            
            /**
             * Copy item's 'arrayLeft'
             */
            for(this.index = 0; this.index < n_ItemLeft; this.index++) {
                arrayLeft[this.index] = array[this.index];
            }
            
                        
            /**
             * Copy item's 'arrayRight'
             */
            for(this.index = n_ItemLeft; this.index < n_ItemLeft + n_ItemRight; this.index++) {
                arrayRight[this.index - n_ItemLeft] = array[this.index];
            }
            
            /**
             * Recursive
             */
            arrayLeft  = this.directBlend(arrayLeft);
            arrayRight = this.directBlend(arrayRight);
            
            this.index    = 0;
            this.position = 0;
            k             = 0;
            
            while(arrayLeft.length != this.position && arrayRight.length != k) {
                if(arrayLeft[this.position] < arrayRight[k]) {
                    array[this.index] = arrayLeft[this.position];
                    this.index++;
                    this.position++;
                } else {
                    array[this.index] = arrayRight[k];
                    this.index++;
                    k++;
                }
            }
            
            /**
             * Array final 'array left'
             */
            while(arrayLeft.length != this.position) {
                array[this.index] = arrayLeft[this.position];
                this.index++;
                this.position++;
            }
            
                        /**
             * Array final 'array left'
             */
            while(arrayRight.length != k) {
                array[this.index] = arrayRight[k];
                this.index++;
                k++;
            }
        }
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
