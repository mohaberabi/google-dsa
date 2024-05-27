package LinkedList;

public class MergeTwoSortedLinkedLists {


    Node mergeTwoSortedLinkedLists(Node a, Node b) {


        Node head = new Node(-1);
        Node tail = head;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                tail = tail.next;
                a = a.next;
            } else {
                tail.next = b;
                tail = tail.next;
                b = b.next;
            }
        }
        while (a != null) {
            tail.next = a;
            tail = tail.next;
            a = a.next;
        }
        while (b != null) {
            tail.next = b;
            tail = tail.next;
            b = b.next;
        }

        return head.next;
    }
}
