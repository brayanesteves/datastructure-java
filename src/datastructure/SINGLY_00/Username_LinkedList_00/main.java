package datastructure.SINGLY_00.Username_LinkedList_00;

import java.util.LinkedList;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add("World!");
        list.add(" ");
        list.add("Brayan");
        list.add("Esteves");
        
        int size = list.size();
        int i    = 0;
        /**
         * Show list singly
         */
        System.out.println("After");
        while(i < size) {
            System.out.print("[" + list.get(i) + "]->");
            i++;
        }
        
        System.out.println();
        
        /**
         * Remove item list singly
         */
        System.out.println("Before");        
        list.remove(2); 
        i    = 0;
        size = list.size();
        while(i < size) {
            System.out.print("[" + list.get(i) + "]->");
            i++;
        }
        
        System.out.println();
        
        /**
         * Remove item list singly
         */
        System.out.println("Before add item index defined");        
        list.add(3, "ENG"); 
        i    = 0;
        size = list.size();
        while(i < size) {
            System.out.print("[" + list.get(i) + "]->");
            i++;
        }
    }
    
}
