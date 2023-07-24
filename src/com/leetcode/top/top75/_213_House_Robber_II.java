package com.leetcode.top.top75;

import java.util.Arrays;

public class _213_House_Robber_II {
    //https://leetcode.com/problems/house-robber-ii/
    //todo todo todo

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        if (nums.length == 3) return Math.max(Math.max(nums[0], nums[1]), nums[2]);
        return Math.max(rob1(Arrays.copyOfRange(nums, 0, nums.length - 1)), rob1(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private int rob1(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
