package LinkedList;

import java.util.HashMap;

public class LRU {
    private DoubleNode head;
    private DoubleNode tail;
    private final HashMap<Integer, DoubleNode> map;
    private final int capacity;
    private int count;

    static class DoubleNode {

        int data;
        int key;
        DoubleNode prev;
        DoubleNode next;

        public DoubleNode(int k, int v) {
            data = v;
            key = k;
        }
    }

    public LRU(int c) {
        head = new DoubleNode(0, 0);
        tail = new DoubleNode(0, 0);
        head.next = tail;
        tail.prev = head;
        head.prev = null;
        tail.next = null;
        map = new HashMap<>();
        capacity = c;
        count = 0;

    }


    void removeNode(DoubleNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    void addHead(DoubleNode node) {
        node.next = head.next;
        head.next.prev = node;
        head.prev = head;
        head.next = node;

    }


    int get(int k) {

        if (map.get(k) != null) {
            DoubleNode node = map.get(k);
            int res = node.data;
            removeNode(node);
            addHead(node);
            return res;
        }
        return -1;
    }

    void set(int k, int v) {
        if (map.get(k) != null) {
            DoubleNode node = map.get(k);
            node.data = v;
            removeNode(node);
            addHead(node);
        } else {
            DoubleNode added = new DoubleNode(k, v);
            if (count < capacity) {
                count++;
                addHead(added);
            } else {
                map.remove(tail.prev.key);
                removeNode(tail.prev);
                addHead(added);
            }
        }
    }

}
