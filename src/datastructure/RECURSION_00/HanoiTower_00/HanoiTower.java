package datastructure.RECURSION_00.HanoiTower_00;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class HanoiTower {
    public void hanoiTower(int disks, int towerA, int towerB, int towerC) {
        if(disks == 1) {
            JOptionPane.showMessageDialog(null, "Move disk to tower " 
                + towerA 
                + ". to tower " 
                + towerB);
        } else {
            
            /**
             * Domain
             */
            this.hanoiTower(disks - 1, towerA, towerC, towerB);
            JOptionPane.showMessageDialog(null, "Move disk to tower " 
                + towerA 
                + ". to tower " 
                + towerC);
            
            this.hanoiTower(disks - 1, towerB, towerA, towerC);
        }
    }
}
