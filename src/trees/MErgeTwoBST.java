package trees;

import java.util.ArrayList;

public class MErgeTwoBST {


    public static ArrayList<Integer> mergeTwoBSTS(Node a, Node b) {


        ArrayList<Integer> aInOrder = new ArrayList<>();
        ArrayList<Integer> bIndOrder = new ArrayList<>();


        ArrayList<Integer> res = new ArrayList<>();


        buildInOrder(a, aInOrder);
        buildInOrder(b, bIndOrder);


        int i = 0;
        int j = 0;
        int n = aInOrder.size();
        int m = bIndOrder.size();

        while (i < n && j < m) {

            if (aInOrder.get(i) <= bIndOrder.get(j)) {
                res.add(aInOrder.get(i));
                i++;
            } else {
                res.add(bIndOrder.get(j));
                j++;
            }
        }


        while (i < n) {
            res.add(aInOrder.get(i));
            i++;
        }

        while (j < m) {
            res.add(bIndOrder.get(j));
            j++;
        }


        return res;
    }


    static void buildInOrder(Node root, ArrayList<Integer> al) {
        if (root == null) {
            return;
        }
        buildInOrder(root.left, al);
        al.add(root.data);
        buildInOrder(root.right, al);
    }
}
