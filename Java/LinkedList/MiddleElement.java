public class MiddleElement {
    public static void main(String[] args) {

        //Creating a Node 
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node
        Node middleNode = findMiddle(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);
    }

    private static Node findMiddle(Node head) {
        /*
         Finding middle node - slow and fast pointers
         When fast pointer reaches end the slow pointer will point to middle node
         */

        Node fast, slow;
        fast = slow = head;

        while (fast != null && fast.next != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
