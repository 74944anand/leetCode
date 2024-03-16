package main;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	
	    public static boolean isIsomorphic(String s, String t) {
	       if (s.length() != t.length()) {
	            return false;
	        }
	        Map<Character, Integer> mapS = new HashMap<>();
	        Map<Character, Integer> mapT = new HashMap<>();
	        
	        // Populate maps with the frequency of characters
	        for (char c : s.toCharArray()) {
	            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
	        }
	        for (char c : t.toCharArray()) {
	            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
	        }
	        
	        System.out.println(mapS);
	        System.out.println(mapT);
	        System.out.println(mapS.values());
	        System.out.println(mapT.values());
	        // Compare the values of the maps
	        return mapS.values().equals(mapT.values());
	    }
	public static void main(String[] args) {
		
		String s= "add";
		String t="egg";
		
		System.out.println(isIsomorphic(s,t));
		

	}

}
