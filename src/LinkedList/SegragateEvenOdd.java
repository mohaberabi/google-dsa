package LinkedList;

public class SegragateEvenOdd {


    Node segragateEvenOdd(Node root) {

        Node evenS = new Node(-1);
        Node evenE = evenS;
        Node oddS = new Node(-1);
        Node odde = oddS;

        while (root != null) {
            if (root.data % 2 == 0) {
                evenE.next = root;
                evenE = evenE.next;
            } else {

                odde.next = root;
                odde = odde.next;
            }

            root = root.next;
        }

        evenE.next = null;

        odde.next = evenS;
        return oddS.next;
    }
}
