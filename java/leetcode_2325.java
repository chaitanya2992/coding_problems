/*  2325. Decode the Message
You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.

key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
Output: "this is a secret" */

class Solution {
    public String decodeMessage(String key, String message) {
    char az=97;
	TreeMap<Character, Character> map = new TreeMap<Character, Character>();
		for(int i=0;i<key.length();i++) {
			char ch = key.charAt(i);
			if(ch !=' ' && !map.containsKey(ch)) {
				map.put(key.charAt(i), (char)az);
				az++;
			}
		}
		String ans="";
		for(int i=0;i<message.length();i++) {
			char ch = message.charAt(i);
			if(ch == ' ') {
				ans += ' ';
			}
			else {
				ans+=map.get(message.charAt(i));
			}
		}
        return ans;
    }
}