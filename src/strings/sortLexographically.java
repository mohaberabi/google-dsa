package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sortLexographically {


    static int[] sortLexo(int n) {


        ArrayList<String> al = new ArrayList<>();


        Collections.sort(al);
        int size = al.size();


        int[] res = new int[size];
        for (int i = 0; i < n; i++) {
            res[i] = Integer.parseInt(al.get(i));


        }
        return res;
    }

    public static void main(String[] args) {
//        int n = 13;
//
//        int[] res = sortLexo(n);
//
//        for (int x : res) {
//            System.out.print(x + " ");
//        }
        String[] t = {"3", "30", "34", "5", "9"};


        Arrays.sort(t, Collections.reverseOrder());
        for (String x : t) {
            System.out.print(x + " ");
        }
    }
}
