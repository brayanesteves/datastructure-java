package datastructure.ALGORITHM_00.SORTING_00.INTERCALATION;

import datastructure.ALGORITHM_00.SORTING_00.BUBBLE.Bubble;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bubble bubble               = new Bubble();
        Intercalation intercalation = new Intercalation();
        
        int[] array_0 = {5, 6, 3, 44, 22, 1};
        int[] array_1 = {5, 2, 1, 8, 3, 9, 7};
        
        int[] file_A  = {503, 573, 581, 625, 670, 762};
        int[] file_B  = {87, 512, 677, 694};
        
        bubble.bubble_v0(array_0);
        bubble.bubble_v0(array_1);
        intercalation.intercalation(array_0, array_1);
        
        bubble.bubble_v0(file_A);
        bubble.bubble_v0(file_B);
        intercalation.intercalation(file_A, file_B);
    }
    
}
