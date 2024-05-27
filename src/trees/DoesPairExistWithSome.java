package trees;

import java.util.ArrayList;

public class DoesPairExistWithSome {


    boolean isPairExistWithSum(Node root, int sum) {
        if (root == null) {
            return false;
        }

        ArrayList<Integer> inorder = new ArrayList<>();
        buildInOrder(root, inorder);


        int i = 0;
        int j = inorder.size() - 1;
        while (i < j) {

            int curr = inorder.get(i) + inorder.get(j);
            if (curr == sum) {
                return true;
            } else if (curr > sum) {
                j--;
            } else {
                i++;
            }
        }

        return false;

    }


    void buildInOrder(Node root, ArrayList<Integer> al) {
        if (root == null) {
            return;


        }


        buildInOrder(root.left, al);
        al.add(root.data);
        buildInOrder(root.right, al);
    }
}
