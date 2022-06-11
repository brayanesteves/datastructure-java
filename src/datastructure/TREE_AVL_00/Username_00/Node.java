package datastructure.TREE_AVL_00.Username_00;

/**
 *
 * @author brayan
 */
public class Node {
    int  Data;
    int  BalanceFactor;
    Node childLeft;
    Node childRight;
    
    public Node(int data) {
        this.Data          = data;
        this.BalanceFactor = 0;
        this.childLeft     = null;
        this.childRight    = null;
    }
}
