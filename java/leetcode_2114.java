/*
2114. Maximum Number of Words Found in Sentences
[https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/]
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6 */

class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
		for(String string : sentences) {
			/*int temp=1;                           // Bruteforce
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)==' ') temp++;
			}*/
            int temp = string.split(" ").length;    // Builtin split function
			count=Math.max(temp, count);
		}
        return count;
    }
}