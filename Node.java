/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Node;

/**
 *
 * @author Admin
 */
public class Node {
    protected int info;
    protected Node next;
    public Node() {
    }

    public Node(int x, Node y) {
        this.info = x;
        this.next = y;
    }
    
   
}
