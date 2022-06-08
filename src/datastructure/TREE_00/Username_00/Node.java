/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure.TREE_00.Username_00;

/**
 *
 * @author brayan
 */
public class Node {
    int Data;
    String Name;
    Node   childLeft;
    Node   childRight;
    
    /**
     * 
     * @param data
     * @param Name {Name node} 
     */
    public Node(int data, String Name) {
        this.Data       = data;
        this.Name       = Name;
        this.childLeft  = null;
        this.childRight = null;
    }
    
    public String toString() {
        return this.Name + " it's data is " + this.Data;
    }
}
