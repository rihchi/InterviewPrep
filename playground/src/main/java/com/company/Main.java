package com.company;
import com.company.Sequences.BestTimeToBuyAndSellStock;
import com.company.Sequences.ContainsDuplicates;
import com.company.Sequences.TwoSum;
import com.company.Sequences.ValidAnagram;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // twoSum(true);
        // containsDuplicates();
        //estTimeToBuyAndSellStock(false);
        validAnagram();
    }

    private static void validAnagram() {
        String s = "anagram";
        String t = "nagaram";
        //boolean res = ValidAnagram.hashSolution(s, t);
        boolean res = ValidAnagram.integerArraySolution(s, t);
        System.out.println(res);
    }

    private static void bestTimeToBuyAndSellStock(boolean useIterative) {
        int[] prices = new int[] {2,1,2,1,0,1,2};
        int res = 0;
        if (useIterative)
            res = BestTimeToBuyAndSellStock.iterativeSolution(prices);
        else
            res = BestTimeToBuyAndSellStock.slidingWindowSolution(prices);

        System.out.println(res);
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
