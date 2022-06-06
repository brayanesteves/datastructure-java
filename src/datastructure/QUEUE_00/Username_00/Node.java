package datastructure.QUEUE_00.Username_00;

/**
 *
 * @author brayan
 */
public class Node {
    String Username;
    Node   Next;
    
    public Node(String Username) {
        this.Username = Username;
        this.Next     = null;
    }
}
