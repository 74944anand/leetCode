package main;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	
	    public static boolean isIsomorphic(String s, String t) {
	    	 if(s.length() != t.length())
	             return false;
	         // Create two maps for s & t strings...
	         int[] map1 = new int[256];
	         int[] map2 = new int[256];
	         // Traverse all elements through the loop...
	         for(int idx = 0; idx < s.length(); idx++){
	             // Compare the maps, if not equal, return false...
	        	 System.out.println(map1[s.charAt(idx)]);
	        	 System.out.println(map2[t.charAt(idx)]);
	        	 System.out.println(map1[s.charAt(idx)] != map2[t.charAt(idx)]);
	             if(map1[s.charAt(idx)] != map2[t.charAt(idx)]) {
	            	 
	            	 return false;
	            	 
	             }    
	             // Insert each character if string s and t into seperate map...
	             map1[s.charAt(idx)] = idx + 1;
	             map2[t.charAt(idx)] = idx + 1;
	         }
	         return true;
	    }
	public static void main(String[] args) {
		
		String s= "add";
		String t="egg";
		
		System.out.println(isIsomorphic(s,t));
		

	}

}
