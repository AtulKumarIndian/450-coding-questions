/*
 * Merge two SORTED linked lists - 
 * Shell sorting was used in case of Arrays
 * Here we will use the technique to merge without using Additional space
 * 
 * 
 */
package linkedList;
import static linkedList.Node.*;
public class MergeTwoSortedLL {

    public static Node sortTwoLinkedLists(Node list1, Node list2) {

        //create a dummy node with value (-1) that serves starting point of merged List and a temp node to point to this List
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        //Till one of the list finishes
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;

        }
        //move the temp data to next node

        //if any list is has remaining elements, point them to this temp node
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        // The new list is in the DummyNode.next
        return dummyNode.next;
    }

    public static void main(String[] args) {

        //Creating two lists 
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        // print both linked lists
        printLL(list1);
        printLL(list2);

        //Merge both lists
        Node mergedList = sortTwoLinkedLists(list1, list2);
        
        // Display the merged list
        printLL(mergedList);

    }
}
