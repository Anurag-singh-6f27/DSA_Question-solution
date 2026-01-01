package Dsa_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int [] currInterval = new int[2];
        currInterval[0]=intervals[0][0];
        currInterval[1]=intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if(currInterval[1]>=intervals[i][0]){
                currInterval[0]=Math.min(currInterval[0],intervals[i][0]);
                currInterval[1]=Math.max(currInterval[1],intervals[i][1]);
            }
            else {
                list.add(new int[]{currInterval[0], currInterval[1]});
                currInterval[0] = intervals[i][0];
                currInterval[1] = intervals[i][1];
            }

        }
        list.add(new int[]{currInterval[0], currInterval[1]});
        return list.toArray(new int[list.size()][]);
    }
    public static void display(int[][]arr){
        for (int[] i:arr){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,3},
                {2,6},
                {8,10},
                {15,18},
        };
        display(merge(arr));
    }
}
