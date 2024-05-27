package sorting;

import java.util.Arrays;

public class AreBookingPossible {


    static class Pair {
        int st;
        int de;

        public Pair(int s, int d) {
            st = s;
            de = d;
        }
    }

    public boolean areBookingsPossible(int K,
                                       int[] arrival,
                                       int[] departure) {


        Arrays.sort(arrival);

        Arrays.sort(departure);

        return true;
//        int n
//        for (int i = 0 ; i )
    }
}
