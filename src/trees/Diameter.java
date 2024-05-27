package trees;

public class Diameter {


    public class Holder {
        int res;

        public Holder() {
            res = 0;
        }
    }


    int diameter(Node root) {


        Holder holder = new Holder();


        getHeightAndBuildDiameter(root, holder);

        return holder.res;
    }


    int getHeightAndBuildDiameter(Node root, Holder holder) {

        if (root == null) {
            return 0;
        }


        int left = getHeightAndBuildDiameter(root.left, holder);


        int right = getHeightAndBuildDiameter(root.right, holder);

        holder.res = Math.max(holder.res, 1 + left + right);
        return 1 + Math.max(left, right);
    }

}
