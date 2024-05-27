package LinkedList;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MErgeKSortedLinkedList {


    Node mergeKSortedLinkedLists(Node[] lists, int k) {

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);


        pq.addAll(Arrays.asList(lists));


        Node head = new Node(-1);
        Node tail = head;
        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            tail.next = poll;
            tail = tail.next;
            if (poll.next != null) {
                pq.add(poll.next);
            }
        }
        return head.next;
    }
}
