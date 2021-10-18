package com.company.Sequences;

public class BestTimeToBuyAndSellStock {

    public static int iterativeSolution(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i=0; i<prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }
        return maxProfit;
    }

    public static int slidingWindowSolution(int[] prices) {
        int left = 0;
        int right = 1;
        int profit = 0;
        while(right != prices.length) {
            if (prices[left] > prices[right]) {
                left = right;
            }
            else if (prices[right] - prices[left] > profit) {
                profit = prices[right] - prices[left];
            }
            right++;
        }

        return profit;
    }
}
