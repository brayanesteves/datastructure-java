package datastructure.SINGLY_00.Username_00;

/**
 *
 * @author Brayan Esteves [brayan.esteves93@gmail.com]
 */
public class Node {
    
    public String Username;
    /**
     * Pointer link
     */
    public Node   Next;
    
    /**
     * Add final
     * @param Username 
     */
    public Node(String Username) {
        this.Username = Username;
    }
    
    /**
     * Add init
     */
    public Node(String Username, Node node) {
        this.Username = Username;
        this.Next     = node;
    }
    
}
