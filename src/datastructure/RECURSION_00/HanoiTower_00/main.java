package datastructure.RECURSION_00.HanoiTower_00;

/**
 *
 * @author brayan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HanoiTower hanoiTower = new HanoiTower();
        int[] tower = {1, 2, 3};
        hanoiTower.hanoiTower(3, 1, 2, 3);
    }
    
}
