package trees;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectAtSameLevel {


    void connectAtSameLevel(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();


        Node prev = null;
        Node end = root;
        Node nextEnd = null;
        q.add(root);
        while (!q.isEmpty()) {
            Node p = q.poll();
            if (p.left != null) {
                q.add(p.left);
                nextEnd = p.left;
            }
            if (p.right != null) {
                q.add(p.right);
                nextEnd = p.right;
            }

            if (prev != null) {
                prev.nextRight = p;
            }
            if (p == end) {
                p.nextRight = null;
                prev = null;
                end = nextEnd;
            } else {
                prev = p;
            }
        }
    }

}
