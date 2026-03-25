/*
2078. Two Furthest Houses With Different Colors
[https://leetcode.com/problems/two-furthest-houses-with-different-colors/description/] 

There are n houses evenly lined up on the street, and each house is beautifully painted. 
You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.
Return the maximum distance between two houses with different colors.
The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.
Input: colors = [1,8,3,8,3]
Output: 4
Input: colors = [1,1,1,6,1,1,1]
Output: 3           */

class Solution {
    public int maxDistance(int[] colors) {
        int ans=0;
	    int n=colors.length-1;
	    for(int i=0;i<n;i++) {
	      	if(colors[0]!=colors[i]) {
	       		ans=Math.max(ans, i);
	       	}	        	
	       	if(colors[n]!=colors[i]) {
	       		ans=Math.max(ans, n-i);
	       	}
	    }
        return ans;
    }
}