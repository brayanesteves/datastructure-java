package datastructure.TREE_00.Username_00;

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
            System.out.println(root.Data);
            inOrder(root.childRight);
        }
    }
    
    /**
     * Iterate 'preOrder'
     * @param root 
     */
    public void preOrder(Node root) {
        if(root != null) {
            System.out.println(root.Data);
            preOrder(root.childLeft);            
            preOrder(root.childRight);
        }
    }
}
