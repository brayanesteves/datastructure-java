package datastructure.CIRCLE_00.Username_00;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class List {
    Node Last;
    
    public List() {
        this.Last = null;
    }
    
    /**
     * Method to know if the list is empty
     */
    public boolean isEmpty() {
        return this.Last == null;
    }
    
    public List add(String item) {
        Node newNode = new Node(item);
        
        if(this.Last != null) {
            newNode.Next   = this.Last.Next;
            this.Last.Next = newNode;
        }
        
        this.Last = newNode;
        
        return this;
    }
    
    public void getList() {
        Node auxiliary = this.Last.Next;
        String list = "";
        
        do {
            list      = list + "[" + auxiliary.Username + "]->";
            auxiliary = auxiliary.Next;
        } while(auxiliary != this.Last.Next);
        
        JOptionPane.showMessageDialog(null, 
                list, 
                "Show list circle", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
        /**
     * Method. Delete 'node' specific
     */
    public boolean delete(String item) {        
        Node current;
        boolean found = false;
        current       = this.Last; 
        while(current.Next != this.Last && !found) {
            found = (current.Next.Username.equals(item));
            if(!found) {
                current = current.Next;
            }
        }
        found = (current.Next.Username.equals(item));
        if(found) {
            Node auxiliary = current.Next;
            if(this.Last == this.Last.Next) {
                this.Last = null;
            } else {
                if(auxiliary == this.Last) {
                    this.Last = current;
                }
                current.Next = auxiliary.Next;
            }
            auxiliary = null;
        }
        return found == true;
    }
}
