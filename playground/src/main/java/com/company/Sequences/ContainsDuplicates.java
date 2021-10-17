package com.company.Sequences;


import java.util.HashSet;

public class ContainsDuplicates {

    public static boolean containsDuplicates(int[] nums) {
        HashSet<Integer> seenNums = new HashSet<>();
        for (int num: nums) {
            if (seenNums.contains(num))
                return true;
            else
                seenNums.add(num);
        }
        return false;
    }
}
