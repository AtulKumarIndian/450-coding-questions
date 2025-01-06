package linkedList;

import static linkedList.Node.*;


public class DeleteNthNodeFromEnd {

      public static Node DeleteNodefromEnd(Node head, int N) {

        // create slow and fast pointers
        Node fast = head, slow = head;

        // Nth node from back means  (totalL - N + 1) from start   ex: - 2nd node from end  = (TotalL - 1) from Start
        //traverse N times the Fast after that traverse slow and fast simultaneously now Fast = tL   and slow = tL - N
        for (int i = 0; i < N; i++) {
            fast = fast.next;
        }

        //if the fast becomes null then the Nth node from end is the head
        if (fast == null) {
            return head.next;
        }

        //after that traverse slow and fast simultaneously now Fast = tL   and slow = tL - N
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        //Delete the node by pointing the slow.next now to the slow.next.next
        Node deletedNode = slow.next;
        slow.next = slow.next.next;
        deletedNode = null;
        return head;

    }

    public static void main(String[] args) {

        //Creating a Node 
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        //prior to delete
        printLL(head);
        // delete the Nth Node from end 
        head = DeleteNodefromEnd(head, N);

        //printing the modified linked list
        printLL(head);
    }

}
