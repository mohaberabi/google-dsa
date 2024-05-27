package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNoFromArray {


    String printLargest(int n, String[] arr) {


        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {


                String xy = x + y;
                String yx = y + x;

                return yx.compareTo(xy);
            }
        });


        String res = "";
        for (String x : arr) {
            res += x;
        }
        return res;
    }
}
