/*  2016. Maximum Difference Between Increasing Elements
[https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/]
Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].

Return the maximum difference. If no such i and j exists, return -1.

Input: nums = [7,1,5,4]
Output: 4 */

class Solution {
    public int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum=0;
        for(int n:nums){
            min=Math.min(n,min);
            sum=Math.max(n-min,sum);
        }
        if(sum<1){
            return -1;
        }
        return sum;
    }
}