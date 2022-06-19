package datastructure.ALGORITHM_00.SORTING_00.SHELL;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shell shell   = new Shell();
        int   array[] = {5, 2, 1, 8, 3, 9, 7};
        
        shell.getArray(1, 0, array);
        shell.shell(array);
    }
    
}
