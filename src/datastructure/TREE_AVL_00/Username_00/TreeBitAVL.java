package datastructure.TREE_AVL_00.Username_00;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class TreeBitAVL {
    private Node root;
    
    public TreeBitAVL() {
        this.root = null;
    }
    
    public Node getRoot() {
        return this.root;
    }
            
    public boolean isEmpty() {
        return this.root == null;
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
    
    public Node addAVL(Node newNode, Node subTree) {
        Node newFather = subTree;
        if(newFather.Data < subTree.Data) {
            if(subTree.childLeft == null) {
                subTree.childLeft = newFather;
            } else {
                subTree.childLeft = this.addAVL(newNode, subTree.childLeft);
                if((this.getBalanceFactor(subTree.childLeft) - getBalanceFactor(subTree.childRight)) == 2) {
                    if(newNode.Data < subTree.childLeft.Data) {
                        newFather = this.leftRotation(subTree);
                    } else {
                        newFather = this.leftDoubleRotation(subTree);
                    }
                }
            }
        } else if(newNode.Data < subTree.Data) {
            if(subTree.childRight == null) {
                subTree.childRight = newNode;
            } else {
                subTree.childRight = this.addAVL(newNode, subTree.childRight);
                if((this.getBalanceFactor(subTree.childRight) - this.getBalanceFactor(subTree.childLeft) == 2)) {
                    if(newNode.Data > subTree.childRight.Data) {
                        newFather = this.rightRotation(subTree);
                    } else {
                        newFather = this.rightDoubleRotation(subTree);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Node duplicate");
        }
        // <.END 'IF'> 
        /**
         * Update Balancer Factor
         */
        if((subTree.childLeft == null) && (subTree.childRight != null)) {
            subTree.BalanceFactor = subTree.childRight.BalanceFactor + 1;
        } else if((subTree.childRight == null) && (subTree.childLeft != null)) {
            subTree.BalanceFactor = subTree.childLeft.BalanceFactor + 1;
        } else {
            subTree.BalanceFactor = Math.max(this.getBalanceFactor(subTree.childLeft), 
                    this.getBalanceFactor(subTree.childRight)) + 1;
        }
        
        return newFather;
    }
    
    public void add(int data) {
        Node newData = new Node(data);
        if(this.root == null) {
            this.root = newData;
        } else {
            this.root = this.addAVL(newData, this.root);
        }
    }
    
        
    /**
     * Iterate 'inOrder'
     */
    public void inOrder(Node root) {
        if(root != null) {
            inOrder(root.childLeft);
            JOptionPane.showMessageDialog(null, root.Data + ", ");
            inOrder(root.childRight);
        }
    }
    
    /**
     * Iterate 'preOrder'
     * @param root 
     */
    public void preOrder(Node root) {
        if(root != null) {
            JOptionPane.showMessageDialog(null, root.Data + ", ");
            preOrder(root.childLeft);            
            preOrder(root.childRight);
        }
    }
        
    /**
     * Iterate 'postOrder'
     * @param root 
     */
    public void postOrder(Node root) {
        if(root != null) {            
            postOrder(root.childLeft);            
            postOrder(root.childRight);
            JOptionPane.showMessageDialog(null, root.Data + ", ");
        }
    }
    
    public boolean delete(int data) {
        
        return true;
    }
}
