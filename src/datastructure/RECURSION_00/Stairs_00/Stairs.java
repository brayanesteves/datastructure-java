package datastructure.RECURSION_00.Stairs_00;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class Stairs {
    
    public void downStairs(int stage) {
        if(stage < 0) {
            stage = stage * -1;
        }
        if(stage == 0) {
            /**
             * Base Case. Explicit response
             */
            JOptionPane.showMessageDialog(null, "You have finished going down the stairs");
        } else {
            try {
                Thread.sleep(500);
                /**
                 * Domain. Division of the original problem [problem - 1]
                 */
                JOptionPane.showMessageDialog(null, "stepping down " + stage);
                /**
                 * Making use of recursion
                 */
                this.downStairs(stage - 1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Stairs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
