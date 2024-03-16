package main;

import java.util.HashSet;

public class UniqueEmailAddress {

	class Solution {
	    public int numUniqueEmails(String[] emails) {
	        HashSet<String> set = new HashSet<>();
	        for (String email : emails) {
	            StringBuilder modifiedEmail = new StringBuilder();
	            String[] parts = email.split("@");
	            for (char c : parts[0].toCharArray()) {
	                if (c == '+') {
	                    break;
	                } else if (c != '.') {
	                    modifiedEmail.append(c);
	                }
	            }
	            modifiedEmail.append('@').append(parts[1]);
	            set.add(modifiedEmail.toString());
	        }
	        return set.size();
	    }
	}
}
