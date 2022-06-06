package datastructure.QUEUE_00.Username_00;

/**
 *
 * @author brayan
 */
public class Queue {
    Node Init;
    Node Final;
    int size;
    
    public Queue() {
        this.Init  = null;
        this.Final = null;
        this.size  = 0;
    }
    
    public boolean isEmpty() {
        return this.Init == null;
    }
    
    public void add(String item) {
        Node newNode = new Node(item);
        if(isEmpty()) {
            this.Init = newNode;
        } else {
            this.Final.Next = newNode;
        }
        this.Final = newNode;
        this.size++;
    }
    
    public String delete() {
        String auxiliary = this.Init.Username;
        this.Init        = this.Init.Next;
        this.size--;
        return auxiliary;
    }
    
    public String initQueue() {
        return this.Init.Username;
    }
    
    public int size() {
        return this.size;
    }
}
