package linkedList;
import static linkedList.Node.*;


public class DeleteGivenNode {
   

    //delete node sets its own data to next nodes's data and next value.. 
    static void deleteNode(Node t) {

        if(t==null || t.data == -1){
            System.out.println("Node isn't present in the list that you are looking for");
            return;
        } 

        t.data = t.next.data;
        t.next = t.next.next;
    }

    //return the node with given value
    static Node getNode(Node head, int val){
        if(head == null){
            return null;
        }
        while(head.data != val) {
            head = head.next;
            if(head.next == null) return new Node(-1);
        }

        return head;
    }

    
    public static void main(String[] args) {
        Node head = null;
        //inserting node
        head = Node.insertNode(head, 1);
        head = Node.insertNode(head, 4);
        head = Node.insertNode(head, 2);
        head = Node.insertNode(head, 3);

        System.out.println("Given Linked List: ");
        printLL(head);

        //Node to be deleted
        Node t = getNode(head,9);
        //delete node
        deleteNode(t);

        //list after deletion operation
        System.out.println("Linked List after deletion: ");
        printLL(head);
    }

}
