/*
1108. Defanging an IP Address
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".*/

class Solution {
    public String defangIPaddr(String address) {

//	using builin replace function.
//		address = address.replace(".","[.]");

        String ansip = "";
		for(int i=0; i<address.length(); i++) {
			if(address.charAt(i) != '.') {
				ansip += address.charAt(i);
			}
			else ansip += "[.]";
		}
        return ansip;
    }
}