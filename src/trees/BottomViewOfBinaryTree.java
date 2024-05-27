package trees;

import java.util.*;

public class BottomViewOfBinaryTree {


    static class Pair {
        int hd;
        Node node;


        public Pair(int h, Node n) {
            hd = h;
            node = n;
        }


        ArrayList<Integer> bottomViewOfTree(Node root) {

            Queue<Pair> q = new LinkedList<>();

            TreeMap<Integer, Integer> map = new TreeMap<>();


            q.add(new Pair(0, root));
            while (!q.isEmpty()) {

                Pair p = q.poll();


                int hd = p.hd;
                Node node = p.node;
                map.put(hd, node.data);


                if (node.left != null) {
                    q.add(new Pair(hd - 1, node.left));
                }

                if (node.right != null) {
                    q.add(new Pair(hd + 1, node.right));
                }


            }
            ArrayList<Integer> res = new ArrayList<>();
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                res.add(e.getValue());
            }
            return res;
        }
    }
}
