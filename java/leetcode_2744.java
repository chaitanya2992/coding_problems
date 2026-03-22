/*
2744. Find Maximum Number of String Pairs
[https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/]
You are given a 0-indexed array words consisting of distinct strings.
The string words[i] can be paired with the string words[j] if:

The string words[i] is equal to the reversed string of words[j].
0 <= i < j < words.length.
Return the maximum number of pairs that can be formed from the array words.

Note that each string can belong in at most one pair.

Input: words = ["cd","ac","dc","ca","zz"]
Output: 2 */

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count =0;
        HashSet<String> set = new HashSet<>();
        for(String word:words){
            String reversewrd = new StringBuilder(word).reverse().toString();
            if(set.contains(reversewrd)){
                count++;
                set.remove(reversewrd);
            }
            else set.add(word);
        }

        return count;
    }
}