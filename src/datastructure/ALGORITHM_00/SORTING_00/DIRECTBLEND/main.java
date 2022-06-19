package datastructure.ALGORITHM_00.SORTING_00.DIRECTBLEND;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DirectBlend directBlend = new DirectBlend();
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        
        directBlend.getArray(1, 0, array);
        directBlend.directBlend(array);
        directBlend.getArray(1, 1, array);
    }
    
}
