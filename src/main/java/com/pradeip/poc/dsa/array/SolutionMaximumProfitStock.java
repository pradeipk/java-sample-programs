package com.pradeip.poc.dsa.array;

// Find the maximum profit from stock prices given in an array.
public class SolutionMaximumProfitStock {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println("Maximum Profit: " + maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length < 2) {
			return 0; // No profit can be made
		}

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		int currentProfit = 0;
		// Iterate through the prices to find the maximum profit
		// by keeping track of the minimum price seen so far.
		// The maximum profit is calculated as the difference between the current price
		// and the minimum price.
		for (int currentPrice : prices) {
			if (currentPrice < minPrice) {
				minPrice = currentPrice; // Update the minimum price
			} else if (currentPrice - minPrice > maxProfit) {
				maxProfit = currentPrice - minPrice; // Calculate profit if selling at current price
			}
			
		}

		return maxProfit;
	}

}
