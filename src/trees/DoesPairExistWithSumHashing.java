package trees;

import java.util.ArrayList;
import java.util.HashSet;

public class DoesPairExistWithSumHashing {


    boolean doesPairExist(Node root, HashSet<Integer> set, int sum) {
        if (root == null) {
            return false;
        }
        if (doesPairExist(root.left, set, sum)) {
            return true;
        }
        if (set.contains(sum - root.data)) {
            return true;
        } else {
            set.add(root.data);
        }
        return doesPairExist(root.right, set, sum);
    }
}
