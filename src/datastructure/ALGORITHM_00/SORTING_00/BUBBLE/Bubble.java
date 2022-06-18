package datastructure.ALGORITHM_00.SORTING_00.BUBBLE;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class Bubble {
    int index;
    int position;
    int temporal;
    int count;
    
    public Bubble() {
        this.index    = 0;
        this.position = 0;
        this.temporal = 0;
    }
    
    public void bubble_v0(int[] array) {
        this.count = 0; 
        for(this.index = 0; this.index < array.length; this.index++) {
            for(this.position = this.index + 1; this.position < array.length; this.position++) {
                if(array[this.index] > array[this.position]) {
                    this.temporal = array[this.index];
                    array[this.index] = array[this.position];
                    array[this.position] = this.temporal;
                }
                this.count++;
            }
        }
        JOptionPane.showMessageDialog(null, "Finally in: " + this.count);
    }
    
    public void bubble_v1(int[] array) {
        this.count = 0; 
        for(this.index = 1; this.index < array.length; this.index++) {
            for(this.position = 0; this.position < array.length - 1; this.position++) {
                if(array[this.position] > array[this.position + 1]) {
                    this.temporal = array[this.position];
                    array[this.position] = array[this.position + 1];
                    array[this.position + 1] = this.temporal;
                }
                this.count++;
            }
        }
        JOptionPane.showMessageDialog(null, "Finally in: " + this.count);
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
