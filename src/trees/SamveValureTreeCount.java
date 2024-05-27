package trees;

public class SamveValureTreeCount {


    public static class Result {

        int res;

        public Result() {
            res = 0;
        }
    }


    int countSubTreesWithSameValue(Node root) {

        Result result = new Result();
        countrec(root, result);

        return result.res;
    }

    boolean countrec(Node root, Result result) {
        if (root == null) {
            return true;

        }


        boolean left = countrec(root.left, result);
        boolean right = countrec(root.right, result);
        if (!left || !right) {
            return false;
        }

        if (root.left != null && root.left.data != root.data) {
            return false;
        }
        if (root.right != null && root.right.data != root.data) {
            return false;
        }
        result.res++;
        return true;
    }
}
