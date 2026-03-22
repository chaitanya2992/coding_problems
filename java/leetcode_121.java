/* 121. Best Time to Buy and Sell Stock
[https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/]
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing
a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input: prices = [7,1,5,3,6,4]
Output: 5 */

class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
		int sum=0;
        for(int n:prices){
            min=Math.min(n,min);
            sum=Math.max(n-min, sum);
        }
        return sum;
    }
}