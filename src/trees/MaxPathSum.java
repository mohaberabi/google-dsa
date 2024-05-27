package trees;

public class MaxPathSum {


    static class Result {
        int res;

        public Result() {
            res = Integer.MIN_VALUE;
        }
    }


    int maxSumPath(Node root) {
        Result result = new Result();


        return result.res;
    }


    int maxUtil(Node root, Result result) {
        if (result == null) {
            return 0;
        }

        int left = Math.max(maxUtil(root.left, result), 0);
        int right = Math.max(maxUtil(root.right, result), 0);

        int current = Math.max(left, right) + root.data;
        result.res = Math.max(result.res, current);

        return Math.max(left, right) + root.data;

    }
}
