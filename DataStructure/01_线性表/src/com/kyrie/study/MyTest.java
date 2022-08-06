package com.kyrie.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/16 17:12
 */
public class MyTest {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{
                {1,4},{0,2},{3,5}
        };
        merge(intervals);
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0];
        });
        List<int[]> list=new ArrayList<>();
        int[] flag = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= flag[1]) {
                flag[1] = Math.max(intervals[i][1], flag[1]);
            } else {
                list.add(flag);
                flag=intervals[i];
            }
        }
        list.add(flag);
        return list.toArray(new int[list.size()][2]);
    }
}
