package com.example.leetcode;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/1/20 10:58
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums=new int[]{5,7,7,8,8,8,10};
        int[] ints = searchRange(nums, 9);
        for (int ans : ints) {
            System.out.println(ans);
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        binarySearch(nums,target,false);
        return new int[]{-1,-1};
    }
    public static int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
