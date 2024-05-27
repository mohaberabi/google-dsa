package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CountSmallerElement {


    static int[] constructLowerArray(int[] arr, int n) {


        int[] res = new int[n];

        int index = 0;

        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    curr++;
                }
            }
            res[index++] = curr;
        }
        return res;
    }

    static public List<Integer> constructLowerArray(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            int c = Collections.binarySearch(temp, arr[i]);
            System.out.println(c);
            if (c < 0) c = -c - 1;
            ans.add(c);
            temp.add(c, arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {


        int[] arr = {12, 1, 2, 3, 0, 11, 4};
        constructLowerArray(arr);
//        int res[] = constructLowerArray(arr, arr.length);
//        for (int x : res) {
//            System.out.print(x + " ");
//        }
    }
}
