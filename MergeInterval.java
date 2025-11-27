package com.org.java;

import java.util.*;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = { {1,3}, {2,6}, {8,10}, {15,18} };
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]); // sort by start time

        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                result.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(new int[]{start, end});

        System.out.print("Merged intervals: ");
        for (int[] arr : result) {
            System.out.print("[" + arr[0] + "," + arr[1] + "] ");
        }
    }
}