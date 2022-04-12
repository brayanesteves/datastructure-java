package datastructure.SINGLY_00.Username_00;

/**
 *
 * @author brayan.esteves93
 */
public class List {
    /**
     * Pointer's
     * It is to know where is the beginning and the end
     */
    protected Node Init;
    protected Node Final;
    
    public List() {
        /**
         * Access to 'node'
         */
        this.Init  = null;
        this.Final = null;
    }
    
    /**
     * Method if list empty
     */
    public boolean isEmpty() {
        if(this.Init == null) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Method add final list
     */
    public void addFinal(String item) {
        if(!isEmpty()) {
            this.Final.Next = new Node(item);
            this.Final      = this.Final.Next;
        } else {
            this.Init  = this.Final;
            this.Final = new Node(item);
        }
    }
    
    /**
     * Method add 'node' to init list
     */
    public void addInit(String item) {
        /**
         * Create 'node'
         */
        this.Init = new Node(item, this.Init);
        
        /**
         * If exist 'node'
         */
        if(this.Final == null) {
            this.Final = this.Init;
        }
    }
    
    /**
     * Method show 'data'
     */
    public void getList() {
        Node iterate = this.Init;
        System.out.println();
        while(iterate != null) {
            System.out.print("[" + iterate.Username + "]==>");
            iterate = iterate.Next;
        }
    }
}
