package trees;

import java.util.*;

public class CousiensOfNode {
    public static ArrayList<Integer> printCousins(Node root, Node node) {
        //code here

        ArrayList<Integer> al = new ArrayList<>();
        if (root == null || node == null) {
            al.add(-1);
            return al;
        }

        Stack<Node> stack = new Stack<>();
        HashMap<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();


        stack.push(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();

            Node left = curr.left;
            Node right = curr.right;

            if (left != null) {
                map.put(left, curr);
                stack.push(left);
            }
            if (right != null) {
                map.put(right, curr);
                stack.push(right);
            }

        }


        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            HashSet<Node> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                Node curr = queue.poll();
                set.add(curr);

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }

            }

            if (set.contains(node)) {
                for (Node x : set) {
                    if (map.get(x) != map.get(node)) {
                        al.add(x.data);
                    }
                }
            }

        }
        if (al.isEmpty()) {
            al.add(-1);
            return al;
        }

        Collections.sort(al);
        return al;
    }
}
