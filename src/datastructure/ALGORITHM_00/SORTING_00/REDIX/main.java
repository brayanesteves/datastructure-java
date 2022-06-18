package datastructure.ALGORITHM_00.SORTING_00.REDIX;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Redix redix = new Redix();        
        int array_0[] = {5, 6, 3, 44, 22, 1};
        
        redix.getArray(1, 0, array_0);
        redix.redix(array_0);
        
        int array_1[] = {55, 4, 43, 44, 2, 10};
        
        redix.getArray(1, 0, array_1);
        redix.redix(array_1);
    }
    
}
