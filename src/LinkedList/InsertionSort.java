package LinkedList;

public class InsertionSort {


    Node sorted;
    Node head;


    void insertionSort(Node unSorted) {
        sorted = null;

        Node curr = unSorted;
        while (curr != null) {
            Node next = curr.next;
            insertInSortedWay(curr);
            curr = next;

        }
        head = sorted;

    }

    void insertInSortedWay(Node node) {
        if (sorted == null || sorted.data >= node.data) {
            node.next = sorted;
            sorted = node;
        } else {
            Node curr = sorted;
            while (curr.next != null && curr.next.data < node.data) {
                curr = curr.next;
            }
            node.next = curr.next;

            curr.next = node;
        }
    }
}
