public class Main {
    
    public static void testLinkedList(){
        System.out.println("Linked List - test");

        LinkedList list = new LinkedList();

        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        list.traverse();
        System.out.println("");

        list.addToTail(4);
        list.addToTail(5);
        list.addToTail(6);
        list.traverse();
        System.out.println("");
        
        list.deleteFromHead();
        list.deleteFromTail();
        list.traverse();
        System.out.println("");

        list.deleteAter(list.search(2));
        list.traverse();
        System.out.println("");

//sai
//        list.dele(3);
//        list.traverse();
//        System.out.println("");

        System.out.print(list.count());
        System.out.println("");
    }
