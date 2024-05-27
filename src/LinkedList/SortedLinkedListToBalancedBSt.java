package LinkedList;


import java.util.ArrayList;

public class SortedLinkedListToBalancedBSt {


    TreeNode convertToBst(Node head) {
        if (head == null) {
            return null;
        }

        ArrayList<Integer> al = new ArrayList<>();
        Node curr = head;
        while (curr != null) {

            al.add(curr.data);
            curr = curr.next;
        }

        TreeNode root = build(al, 0, al.size() - 1);
        return root;
    }

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    TreeNode build(ArrayList<Integer> al, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(al.get(mid));

        root.left = build(al, start, mid - 1);

        root.right = build(al, mid + 1, end);
        return root;
    }
}
