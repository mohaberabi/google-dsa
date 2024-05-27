package sorting;

import java.util.*;

public class SortArrayToOther {


    public static int[] sortAbyB(int[] a, int b[]) {


        ArrayList<Integer> res = new ArrayList<>();


        HashMap<Integer, Integer> freq = new HashMap<>();

        HashSet<Integer> s = new HashSet<>();
        for (int x : a) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        for (int x : b) {
            s.add(x);
        }


        for (int x : b) {
            if (freq.containsKey(x)) {
                for (int i = 0; i < freq.get(x); i++) {
                    res.add(x);
                }
            }
        }


        ArrayList<Integer> other = new ArrayList<>();
        for (int x : a) {
            if (!s.contains(x)) {
                other.add(x);
            }
        }


        Collections.sort(other);

        res.addAll(other);
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {

            arr[i] = res.get(i);
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] a = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] b = {2, 1, 8, 3};
        int[] res = sortAbyB(a, b);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
