package com.company;
import com.company.Sequences.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 4};
        int target = 6;
        int[] res = TwoSum.twoSumBruteForce(nums, target);
        System.out.println(Arrays.toString(res));
    }

    private static void callTwoSum() {

    }


}
