package com.company.Sequences;

public class TwoSum {
    private int[] nums;
    private int target;

    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (target - nums[i] == nums[j])
                    return new int[] {i, j};
            }
        }

        return new int[0];
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }
}
