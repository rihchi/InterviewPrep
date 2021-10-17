package com.company;
import com.company.Sequences.ContainsDuplicates;
import com.company.Sequences.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      // twoSum(true);
        //containsDuplicates();
    }

    private static void containsDuplicates() {
        int[] nums = new int[] {1, 2, 3, 1};
        boolean res = ContainsDuplicates.containsDuplicates(nums);
        System.out.println(res);
    }

    private static void twoSum(boolean isOptimal) {
        int[] nums = new int[] {3, 2, 4};
        int target = 6;
        int[] res;

        if (!isOptimal)
            res = TwoSum.twoSumBruteForce(nums, target);
        else
            res = TwoSum.twoSumHash(nums, target);

        System.out.println(Arrays.toString(res));
    }


}
