package datastructure.GRAPHS_00.SHORTCUT.AlgorithmFloyd_00;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long matrizA[][] = {
            {        0,         3,         4, 999999999,         8, 999999999},
            {999999999,         0, 999999999, 999999999,         5, 999999999},
            {999999999, 999999999,         0, 999999999,         3, 999999999},
            {999999999, 999999999, 999999999,         0, 999999999, 999999999},
            {999999999, 999999999, 999999999,         7,         0,         3},
            {999999999, 999999999, 999999999,         2, 999999999,         0}
        };
        Shortcut way = new Shortcut();
        System.out.println(way.algorithmFloyd(matrizA));
    }

}
