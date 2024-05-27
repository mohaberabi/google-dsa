package LinkedList;

import java.util.HashMap;
import java.util.Random;

public class CloneLinkedListWithRandomPointer {


    static class RandomNode {
        int data;
        RandomNode next;
        RandomNode random;


        public RandomNode(int d) {
            data = d;
            next = null;
            random = null;
        }


        RandomNode clone2(RandomNode head) {


            for (RandomNode curr = head; curr != null; ) {

                RandomNode next = curr.next;
                curr.next = new RandomNode(curr.data);
                curr.next.next = next;
                curr = next;
            }


            RandomNode original = head;
            RandomNode copy = head.next;
            RandomNode temp = copy;
            for (RandomNode curr = head; curr != null; curr = curr.next.next) {
                curr.next.random = (curr.random != null) ? curr.random.next : null;

            }
            return head;
        }

        RandomNode clone(RandomNode head) {
            HashMap<RandomNode, RandomNode> map = new HashMap<>();
            for (RandomNode curr = head; curr != null; curr = curr.next) {
                map.put(curr, new RandomNode(curr.data));
            }
            for (RandomNode curr = head; curr != null; curr = curr.next) {

                RandomNode clone = map.get(curr);
                clone.next = map.get(curr.next);
                clone.random = map.get(curr.random);
            }


            return map.get(head);


        }
    }
}
