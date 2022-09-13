/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Node;

/**
 *
 * @author Admin
 */
public class MyList {
    protected Node head, tail;

    public MyList() {
        this.head = this.tail = null;
    }

    public MyList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void clear(){
        head = tail = null;
    }
    public void add(int x){
        if(isEmpty()){
            head = tail = new Node(x, null);
        }else{
            Node y = new Node(x, null);
            tail.next = y; 
            tail = y;
        }
    }
    public void traverse(){
        Node y = head;
        while(y!=null){
            System.out.println(" "+ y.info);
            y = y.next;
        }
        System.out.println();
    }
    public void delete(int x){
        if(isEmpty()){
            System.out.println("There is nothing to be deleted");
            
        }else{
            head = head.next;
            
        }
    }
    
}
