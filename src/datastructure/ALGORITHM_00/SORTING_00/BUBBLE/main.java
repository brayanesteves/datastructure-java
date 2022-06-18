package datastructure.ALGORITHM_00.SORTING_00.BUBBLE;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bubble bubble = new Bubble();        
        int array_0[] = {5, 6, 3, 44, 22, 1};
        
        bubble.getArray(1, 0, array_0);
        bubble.bubble_v0(array_0);
        bubble.getArray(1, 1, array_0);
        
        int array_1[] = {55, 4, 43, 44, 2, 10};
        
        bubble.getArray(1, 0, array_1);
        bubble.bubble_v1(array_1);
        bubble.getArray(1, 1, array_1);
    }
    
}
