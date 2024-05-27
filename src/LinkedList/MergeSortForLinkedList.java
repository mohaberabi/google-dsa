package LinkedList;

public class MergeSortForLinkedList {


    Node mergeSort(Node head) {
        if (head == null) {
            return null;
        }

        Node mid = getMed(head);
        Node head2 = mid.next;
        mid.next = null;
        Node sorted1 = mergeSort(head);
        Node sorted2 = mergeSort(head2);
        Node merged = merge(sorted1, sorted2);
        return merged;
    }

    Node getMed(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    Node merge(Node a, Node b) {

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
