package trees;

public class BuildeTreeFromInAndPreORder {


    static class Holder {
        int index;


        public Holder() {
            index = 0;
        }


    }


    Node buildFromInAndPre(int[] in, int[] pre, int start, int end, Holder holder) {
        if (start > end) {
            return null;
        }

        Node root = new Node(pre[holder.index]);
        holder.index++;

        int inIndex = start;
        for (int i = start; i < end; i++) {
            if (in[i] == root.data) {
                inIndex = i;
                break;

            }
        }

        root.left = buildFromInAndPre(in, pre, start, inIndex - 1, holder);
        root.left = buildFromInAndPre(in, pre, inIndex + 1, end, holder);
        return root;
    }
}
