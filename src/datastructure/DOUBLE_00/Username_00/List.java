package datastructure.DOUBLE_00.Username_00;

import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class List {
    private Node Init;
    private Node Final;
    
    public List() {
        this.Init  = null;
        this.Final = null;
    }
        
    /**
     * Method if list empty
     */
    public boolean isEmpty() {
        return this.Init == null;
    }
 
    /**
     * Method add final list
     * @param item 
     */
    public void addFinal(String item) {
        if(!isEmpty()) {
            this.Final               = new Node(item, null, this.Final);
            this.Final.Previous.Next = this.Final;
        } else {
            this.Init   = new Node(item);
            this.Final  = new Node(item);
        }
    }
 
    /**
     * Method add 'node' to init list
     * @param item 
     */
    public void addInit(String item) {
        if(!isEmpty()) {
            /**
             * Create 'node'
             */
            this.Init               = new Node(item, this.Init, null);
            this.Init.Next.Previous = this.Init;
        } else {
            this.Init   = new Node(item);
            this.Final  = new Node(item);
        }

    }
    
    /**
     * Method show 'data' => 'init' to 'final'
     */
    public void getListInitFinal() {
        if(!isEmpty()) {
            String data = "<=>";
            Node iterate = this.Init;
            while(iterate != null) {
                data = data + "[" + iterate.Username + "]<=>";
                iterate = iterate.Next;
            }
            JOptionPane.showMessageDialog(null, 
                    data, 
                    "Show List Init to Final", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
        
    /**
     * Method show 'data' => 'Final' to 'Init'
     */
    public void getListFinalInit() {
        if(!isEmpty()) {
            String data = "<=>";
            Node iterate = this.Final;
            while(iterate != null) {
                data = data + "[" + iterate.Username + "]<=>";
                iterate = iterate.Previous;
            }
            JOptionPane.showMessageDialog(null, 
                    data, 
                    "Show List Final to Init", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    
}
