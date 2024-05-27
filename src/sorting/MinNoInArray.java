package sorting;

import java.util.Arrays;

public class MinNoInArray {


    String minNoInArray(int[] arr) {


        int n = arr.length;
        Arrays.sort(arr);


        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.append(String.valueOf(arr[i]));
            } else {
                odd.append(String.valueOf(arr[i]));

            }
        }

        int sum = Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
        return Integer.toString(sum);
    }
}
