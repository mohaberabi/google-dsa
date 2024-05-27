package trees;

import java.util.*;

public class VerticalTraversalOfBinaryTree {


    public static class Pair {
        int hd;
        Node node;


        public Pair(int h, Node n) {
            node = n;
            hd = h;
        }
    }


    static ArrayList<Integer> vertivalTraversal(Node root) {

        ArrayList<Integer> res = new ArrayList<>();


        Queue<Pair> q = new LinkedList<>();


        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

        q.add(new Pair(0, root));
        while (!q.isEmpty()) {


            Pair p = q.poll();


            Node node = p.node;
            int hd = p.hd;
            if (map.containsKey(hd)) {
                map.get(hd).add(node.data);
            } else {

                ArrayList<Integer> al = new ArrayList<>();
                al.add(node.data);
                map.put(hd, al);
            }

            if (node.left != null) {
                q.add(new Pair(hd - 1, node.left));
            }
            if (node.right != null) {
                q.add(new Pair(hd + 1, node.right));
            }
        }


        for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
            res.addAll(e.getValue());
        }
        return res;
    }
}
