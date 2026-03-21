/*
771. Jewels and Stones
You're given strings jewels representing the types of stones that are jewels, 
and stones representing the stones you have. Each character in stones is a type of stone you have.
You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A" 
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3 */

class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        HashMap<Character, Integer> map = new HashMap<>();
		int count=0;

		for(char s:stones.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
        
		for(char j:jewels.toCharArray()) {
			if(map.containsKey(j)) {
				count+=map.get(j);
			}
		}
        return count;
    }
}