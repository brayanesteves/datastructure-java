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
