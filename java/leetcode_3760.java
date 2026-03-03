class Solution {
    public int maxDistinct(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		return(map.size());
    }
}