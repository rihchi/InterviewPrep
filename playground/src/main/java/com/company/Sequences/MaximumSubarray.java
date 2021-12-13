package com.company.Sequences;

public class MaximumSubarray {

    public static int solution(int[] nums)
    {
        int maxSum = Integer.MIN_VALUE;
        int runningSum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            runningSum = Math.max(nums[i] + runningSum, nums[i]);
            maxSum = Math.max(runningSum, maxSum);
        }

        return maxSum;
    }

}
