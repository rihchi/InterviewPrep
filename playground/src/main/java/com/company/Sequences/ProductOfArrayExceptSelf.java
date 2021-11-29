package com.company.Sequences;

public class ProductOfArrayExceptSelf {

    // O(n) Time | O(1) Space
    public static int[] solution(int[] nums) {
        // Instantiate output array
        int[] output = new int[nums.length];

        // Calculate prefix products
        int prefixVal = nums[0];
        output[0] = 1;
        for (int i=1; i<nums.length; i++) {
            output[i] = prefixVal;
            prefixVal *= nums[i];
        }

        // Calculate final output with running postfix product
        int postfixVal = 1;
        for (int i=nums.length-1; i>=0; i--) {
            output[i] = output[i] * postfixVal;
            postfixVal = postfixVal * nums[i];
        }

        return output;
    }

    private static void printIntArray(int[] inputArr) {
        for (int i=0; i<inputArr.length; i++) {
            System.out.print(inputArr[i] + " ");
        }
    }
}
