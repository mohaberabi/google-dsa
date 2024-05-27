package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MergeOVerlappingIntervals {
    static  class Pair {
        int st ;
        int end ;
        public  Pair ( int s , int e){


            st = s ;
            end =e ;
        }


    }

    public int[][] overlappedInterval(int[][] arr )
    {

        int n = arr.length;
        ArrayList<Pair> pairs = new ArrayList<>();

        for( int i = 0 ; i <n ; i ++){

            int st = arr[i][0];
            int end = arr[i][1];
            Pair p = new Pair (st , end);
            pairs.add(p);

        }
        Collections.sort(pairs,(a, b)->a.st-b.st);


        int res = 0 ;
        for( int i =1 ; i < n ; i++){
            if(pairs.get(res).end>=pairs.get(i).st ){
                pairs.get(res).end = Math.max(pairs.get(res).end,pairs.get(i).end);
                pairs.get(res).st = Math.min(pairs.get(res).st,pairs.get(i).st);

            }
            else {
                res ++;

                pairs.set(res, pairs.get(i));
            }
        }


        int m = pairs.size();
        int [][] ans = new int[m][2];
        for(int i = 0 ; i < m ; i ++){

            int[] subAns = {pairs.get(i).st,pairs.get(i).end};
            ans[i]=subAns;
        }
return ans ;
    }
}
