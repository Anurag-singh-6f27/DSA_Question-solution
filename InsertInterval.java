package Dsa_Questions;
//https://leetcode.com/problems/insert-interval/
import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int i = 0;
        int n = intervals.length;
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }

    public void display(int[][]arr){
        for (int[] ints : arr) {
            System.out.print("( ");
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.print(")");
        }
    }

    public static void main(String[] args) {
        int [][] arr1={
                {1,3},
                {6,9}
        };
        int [][] arr2={
                {1,2},
                {3,5},
                {6,7},
                {8,10},
                {12,16}
        };
        int[][] interval={
                {2,5},
                {4,8}
        };
        InsertInterval obj=new InsertInterval();
        obj.display(obj.insert(arr1,interval[0]));
        System.out.println();
        obj.display(obj.insert(arr2,interval[1]));
    }
}
/*
 public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int m = 0;
        if(n == 0) return new int[][]{newInterval};
        for(int i = 0; i < n; i++) {
            if(intervals[i][1] < newInterval[0]) {
                if(i == n - 1) {
                    m++;
                }
            } else if(intervals[i][0] > newInterval[1]) {
                if(i == 0 || intervals[i - 1][1] < newInterval[0]) {
                    m++;
                }
            } else {
                int start = Math.min(intervals[i][0], newInterval[0]);
                int end = Math.max(intervals[i][1], newInterval[1]);
                while(i + 1 < n && end >= intervals[i + 1][0]) {
                    end = Math.max(intervals[i + 1][1], end);
                    i++;
                }
            }
            m++;
        }
        int[][] merged = new int[m][2];
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(intervals[i][1] < newInterval[0]) {
                merged[j++] = intervals[i];
                if(i == n - 1) {
                    merged[j++] = newInterval;
                }
            } else if(intervals[i][0] > newInterval[1]) {
                if(i == 0 || intervals[i - 1][1] < newInterval[0]) {
                    merged[j++] = newInterval;
                }
                merged[j++] = intervals[i];
            } else {
                int start = Math.min(intervals[i][0], newInterval[0]);
                int end = Math.max(intervals[i][1], newInterval[1]);
                while(i + 1 < n && end >= intervals[i + 1][0]) {
                    end = Math.max(intervals[i + 1][1], end);
                    i++;
                }
                merged[j++] = new int[]{start, end};
            }
        }
        return merged;
    }
 */
