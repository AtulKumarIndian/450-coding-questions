/*
@Author Atul Kumar gupta
 * Created a node type (Singly Linked list) which has 2 members 
 * 1. Data of type int
 * 2. next of type Node - which points to next node
 * 
 * This Node type is shared across all questions in Linked List directory
 */

public class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
