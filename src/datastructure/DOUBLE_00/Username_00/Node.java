package datastructure.DOUBLE_00.Username_00;

/**
 *
 * @author brayan
 */
public class Node {
    public String Username;
    Node Next;
    Node Previous;
    
        
    /**
     * Constructor for when there are no nodes
     * @param Username 
     */
    public Node(String Username){
        /**
         * this(Username, null, null) => Node(String Username, Node nodeNext, Node nodePrevious)
         */
        this(Username, null, null);
    }
    
    /**
     * Constructor for when nodes exist
     * @param Username
     * @param nodeNext
     * @param nodePrevious 
     */    
    public Node(String Username, Node nodeNext, Node nodePrevious) {
        this.Username = Username;
        this.Next     = nodeNext;
        this.Previous = nodePrevious;
    }

}
