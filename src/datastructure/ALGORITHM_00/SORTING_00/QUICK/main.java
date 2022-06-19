package datastructure.ALGORITHM_00.SORTING_00.QUICK;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quick quick   = new Quick();
        int   array[] = {5, 2, 1, 8, 3, 9, 7};
        
        quick.getArray(1, 0, array);
        quick.quick(array, 0, array.length - 1);
        
    }
    
}
