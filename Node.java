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
    
  
    Node(int info) {
        this(info, null);
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
