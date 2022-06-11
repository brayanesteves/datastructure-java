package datastructure.TREE_AVL_00.Username_00;

/**
 *
 * @author brayan
 */
public class TreeBitAVL {
    private Node root;
    
    public TreeBitAVL() {
        this.root = null;
    }
    
    public Node search(int data, Node root) {
        if(this.root == null) {
            return null;
        } else if(root.Data == data) {
            return root;
        } else if(root.Data < data) {
            return this.search(data, root.childRight);
        } else {
            return this.search(data, root.childLeft);
        }
    }
    
    /**
     * Getting Balance Factor
     * @param node
     * @return 
     */
    public int getBalanceFactor(Node node) {
        if(node == null) {
            return -1;
        } else {
            return node.BalanceFactor;
        }
    }
    
    /**
     * Rotation singly left
     * @return 
     */
    public Node leftRotation(Node node) {
        Node auxiliary          = node.childLeft;
        node.childLeft          = auxiliary.childRight;
        auxiliary.childRight    = node;
        node.BalanceFactor      = Math.max(this.getBalanceFactor(node.childLeft), this.getBalanceFactor(node.childRight)) + 1;
        auxiliary.BalanceFactor = Math.max(this.getBalanceFactor(auxiliary.childLeft), this.getBalanceFactor(auxiliary.childRight)) + 1;
        return auxiliary;
    }
    
    /**
     * Rotation singly right
     * @param node
     * @return 
     */
    public Node rightRotation(Node node) {
        Node auxiliary          = node.childRight;
        node.childRight         = auxiliary.childLeft;
        auxiliary.childLeft     = node;
        node.BalanceFactor      = Math.max(this.getBalanceFactor(node.childLeft), this.getBalanceFactor(node.childRight)) + 1;
        auxiliary.BalanceFactor = Math.max(this.getBalanceFactor(auxiliary.childLeft), this.getBalanceFactor(auxiliary.childRight)) + 1;
        return auxiliary;
    }
    
    /**
     * Rotation double left
     * @param node
     * @return 
     */
    public Node leftDoubleRotation(Node node) {
        Node auxiliary;
        node.childLeft = this.rightRotation(node.childLeft);
        auxiliary      = this.leftRotation(node);
        return auxiliary;
    }
    
        /**
     * Rotation double right
     * @param node
     * @return 
     */
    public Node rightDoubleRotation(Node node) {
        Node auxiliary;
        node.childRight = this.rightRotation(node.childRight);
        auxiliary       = this.rightRotation(node);
        return auxiliary;
    }
}
