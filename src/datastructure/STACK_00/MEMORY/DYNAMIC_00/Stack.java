package datastructure.STACK_00.MEMORY.DYNAMIC_00;

/**
 *
 * @author brayan
 */
public class Stack {
    private Node peak;
    int size;
    
    public Stack() {
        this.peak = null;
        this.size = 0;
    }
    
    /**
     * 
     */
    public boolean isEmpty() {
        return this.peak == null;
    }
    
    public void push(int data) {
        Node newNodeStack = new Node(data);
        newNodeStack.Next = this.peak;
        this.peak         = newNodeStack;
        this.size++;
    }
    
    public int pop() {
        int auxiliary = this.peak.data;
        this.peak = this.peak.Next;
        this.size--;
        
        return auxiliary;
    }
    
    public int peak() {
        return this.peak.data;
    }
    
    public int size() {
        return this.size;
    }
    
    public void truncate() {
        while(!isEmpty()) {
            pop();
        }
    }
}
