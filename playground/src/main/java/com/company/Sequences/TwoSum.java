package com.company.Sequences;

import java.util.HashMap;

public class TwoSum {

    // Time - O(n^2)
    // Space - O(1)
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (target - nums[i] == nums[j])
                    return new int[] {i, j};
            }
        }
        return new int[0];
    }

    // Time - O(n)
    // Space - O(n)
    public static int[] twoSumHash(int[] nums, int target) {
        HashMap<Integer, Integer> seenValues = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (seenValues.containsKey(target - nums[i]))
                return new int[] {seenValues.get(target - nums[i]), i};
            else {
                seenValues.put(nums[i], i);
            }
        }

        return new int[0];
    }

}
