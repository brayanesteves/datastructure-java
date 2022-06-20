package datastructure.ALGORITHM_00.SORTING_00.NATURALBLEND;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaturalBlend naturalBlend = new NaturalBlend();
        int[] array = {22, 23, 30, 2, 5, 10, 8, 9, 13};
        
        naturalBlend.getArray(1, 0, array);
        naturalBlend.naturalBlend(array);
        naturalBlend.getArray(1, 1, array);
    }
    
}
