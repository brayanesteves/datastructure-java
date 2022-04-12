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
            this.Init  = new Node(item);
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
    
    /**
     * Method. Delete 'node' to init
     */
    public String deleteInit(){
        String item = this.Init.Username;
        if(this.Init == this.Final) {
            this.Init  = null;
            this.Final = null;
        } else {
            this.Init = this.Init.Next;            
        }
        
        return item;
    }
    
    /**
     * Method. Delete 'node' to final
     */
    public String deleteFinal(){
        String item = this.Final.Username;
        if(this.Init == this.Final) {
            this.Init  = null;
            this.Final = null;
        } else {
            /**
             * Iterate list
             */
            Node nodeTemp = this.Init;
            while(nodeTemp.Next != this.Final) {
                nodeTemp = nodeTemp.Next;    
            }   
            this.Final      = nodeTemp;
            this.Final.Next = null;
        }
        
        return item;
    }
    
    /**
     * Method. Delete 'node' specific
     */
    public void deleteNode(String item) {
        if(!isEmpty()) {
            if(this.Init == this.Final && item.equals(this.Init.Username)) {
                this.Init  = null;
                this.Final = null;
            } else if(item.equals(this.Init.Username)) {
                this.Init = this.Init.Next;
            } else {
                Node last;
                Node temp;
                
                last = this.Init;
                temp = this.Init.Next;
                
                /**
                 * Iterate list
                 */
                while(temp != null && !temp.Username.equals(item)) {
                    last = last.Next;
                    temp = temp.Next;
                }
                
                if(temp != null) {
                    last.Next = temp.Next;
                    if(temp == this.Final) {
                        this.Final = last;
                    }
                }
            }
        }
    }
}
