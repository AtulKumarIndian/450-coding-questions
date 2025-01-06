/*
 * have to return the node of intersection of two list, if not return null
 * 
 * 1st approach - If there is intersection two lists will have same same attribute
 */
package linkedList;
import static linkedList.Node.*;

public class IntersectionOfLists {


    static Node intersectionPoint(Node head1, Node head2) {
        while (head2 != null) {
            //iterate head 2
            Node temp = head1;
            while (temp != null) {
                //iterate for each head1 check if its equal to temporary head2
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        // if no intersection present
        return null;
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        Node head = null;
        head=insertNode(head,1);
        head=insertNode(head,3);
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,4);
//        [1 -> 3 -> 1 -> 2 -> 4 ]
        Node head1 = head;
        head = head.next.next.next;
//        head points to [2 -> 4]
        Node headSec = null;
        headSec=insertNode(headSec,3);
//        [3]
        Node head2 = headSec;
        headSec.next = head;
//        [3 -> 2 -> 4]
        //printing of the lists
        System.out.print("List1: ");
         printList(head1);
        System.out.print("List2: "); 
        printList(head2);
        //checking if intersection is present
        Node answerNode = intersectionPoint(head1,head2);
        if(answerNode == null) System.out.println("No intersection");
        else System.out.println("The intersection point is "+answerNode.data);
        

    }
}
