package LinkedList;

import java.util.PriorityQueue;

public class FlattenLinkedList {


    static class FlatNode {
        int data;
        FlatNode next;
        FlatNode bottom;

        public FlatNode(int d) {
            data = d;
            next = null;
            bottom = null;
        }


        FlatNode flatten(FlatNode head) {
            PriorityQueue<FlatNode> pq = new PriorityQueue<>((a, b) -> a.data - b.data);


            while (head != null) {
                pq.add(head);
                head = head.next;
            }


            FlatNode newHead = new FlatNode(-1);

            FlatNode tail = newHead;
            while (!pq.isEmpty()) {

                FlatNode curr = pq.poll();
                tail.bottom = curr;
                tail = tail.bottom;
                if (curr.bottom != null) {
                    pq.add(curr.bottom);
                }
            }


            tail.bottom = null;
            return newHead.bottom;
        }
    }
}
