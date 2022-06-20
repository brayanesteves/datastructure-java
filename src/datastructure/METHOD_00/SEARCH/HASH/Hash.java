package datastructure.METHOD_00.SEARCH.HASH;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class Hash {
    
    String[] array;
    int      size;
    int      count;            
    int      index;
    int      position;
    int      temporal;  
    
    public  Hash(int size) {
        this.index    = 0;
        this.position = 0;
        this.temporal = 0;
        this.size     = size;
        this.array    = new String[size];
        Arrays.fill(this.array, "-1");
    }
    
    public void functionHash(String[] chainArray, String[] array) {
        for(this.index = 0; this.index < chainArray.length; this.index++) {
            String item    = chainArray[this.index];
            int indexArray = Integer.parseInt(item) % chainArray.length;
            JOptionPane.showMessageDialog(null, "The index is: " 
                    + indexArray 
                    + " for item/value " 
                    + item);
            
            /**
             * Colission
             */
            while(array[indexArray] != "-1") {
                indexArray++;
                JOptionPane.showMessageDialog(null, "A collision occurred in the index " 
                        + (indexArray - 1) 
                        + " Change at index " 
                        + indexArray);
                indexArray %= this.size;                
            }
            array[indexArray]  = item;
        }
    }
    
    public String searchKey(String item) {
        int indexArray = Integer.parseInt(item) % 7;
        int count      = 0;
        while(this.array[indexArray] != "-1") {
            if(this.array[indexArray] == item) {
                JOptionPane.showMessageDialog(null, 
                        "The item " 
                                + item 
                                + " found index " 
                                + indexArray);
                return array[indexArray];
            } 
            indexArray++;
            indexArray %= this.size;
            count++;
            if(count >= this.array.length) {
                break;
            }
        }
        return null;
    }
    
    //Metodo para mostrar la tabla
    public void show() {
	int increment = 0, i;
	for(i = 0; i < 1; i++) {
            increment += 8;
            for(this.position = 0; this.position < 71; this.position++) {
		System.out.print("-");
            }
            System.out.println();
            for(this.position = increment - 8; this.position < increment; this.position++) {
		System.out.format("|%3s"+"", this.position);	
            }
            System.out.println("|");
            for(int n = 0; n < 71; n++) {
		System.out.print("-");	
            }
            System.out.println();
            for(this.position = increment - 8; this.position < increment; this.position++) {
		if(this.array[this.position].equals("-1")) {
                    System.out.print("|");
		} else {
                    System.out.print(String.format("|%3s"+"", this.array[this.position]));
		}
            }
            System.out.println("|");
            for(this.position = 0; this.position < 71; this.position++) {
		System.out.print("-");
            }
	}
    }
}
