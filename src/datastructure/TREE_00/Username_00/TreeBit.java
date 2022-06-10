package datastructure.TREE_00.Username_00;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class TreeBit {
    Node root;
    
    public TreeBit() {
        this.root = null;
    }
    
    public void add(int data, String Name) {
        Node newNode = new Node(data, Name);
        
        if(this.root == null) {
            this.root = newNode;
        } else {
            Node auxiliary = this.root;
            Node father;
            
            while(true) {
                
                father = auxiliary;
                
                if(data < auxiliary.Data) {
                    auxiliary = auxiliary.childLeft;
                    
                    if(auxiliary == null) {
                        father.childLeft = newNode;
                        return;
                    }
                } else {
                    auxiliary = auxiliary.childRight;
                    
                    if(auxiliary == null) {
                        father.childRight = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean isEmpty() {
        return this.root == null;
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
    
    public Node searchNode(int data) {
        Node auxiliary = this.root;
        while(auxiliary.Data != data) {
            if(data < auxiliary.Data) {
                auxiliary = auxiliary.childLeft;
            } else {
                auxiliary = auxiliary.childRight;
            }
            if(auxiliary == null) {
                return null;
            }
        }
        
        return auxiliary;
    }
    
    public boolean delete(int data) {
        Node auxiliary      = this.root;
        Node father         = this.root;
        boolean isChildLeft = true;
        
        while(auxiliary.Data != data) {
            father = auxiliary;
            if(data < auxiliary.Data) {
                isChildLeft = true;
                auxiliary   = auxiliary.childLeft;
            } else {
                isChildLeft = false;
                auxiliary   = auxiliary.childRight;
            }
            
            if(auxiliary == null) {
                return false;
            }
        }
        
        /**
         * It is node is child
         */
        if(auxiliary.childLeft == null && auxiliary.childRight == null) {
            if(auxiliary == this.root) {
                this.root = null;
            } else if(isChildLeft) {
                father.childLeft  = null;
            } else {
                father.childRight = null;
            }
        } else if(auxiliary.childRight == null) {
            if(auxiliary == this.root) {
                this.root = auxiliary.childLeft;
            } else if(isChildLeft) {
                father.childLeft  = auxiliary.childLeft;
            } else {
                father.childRight = auxiliary.childLeft;
            }
        } else if(auxiliary.childLeft == null) {
            if(auxiliary == this.root) {
                this.root = auxiliary.childRight;
            } else if(isChildLeft) {
                father.childLeft  = auxiliary.childRight;
            } else {
                father.childRight = auxiliary.childRight;
            }
        } else {
            Node replace = getNodeReplace(auxiliary);
            if(auxiliary == this.root) {
                this.root = replace;
            } else if(isChildLeft) {
                father.childLeft = replace;
            } else {
                father.childRight = replace;
            }            
            replace.childLeft = auxiliary.childLeft;
        }
        return true;
    }
    
    public Node getNodeReplace(Node nodeReplace) {
        Node replaceFather = nodeReplace;
        Node replace       = nodeReplace;
        Node auxiliary     = nodeReplace.childRight;
        
        while(auxiliary != null) {
            replaceFather = replace;
            replace       = auxiliary;
            auxiliary     = auxiliary.childLeft;
        }
        
        if(replace != nodeReplace.childRight) {
            replaceFather.childLeft = replace.childRight;
            replace.childRight      = nodeReplace.childRight;
        }
        JOptionPane.showMessageDialog(null, "Node replace is: " + replace);
        return replace;
    }
    
}
