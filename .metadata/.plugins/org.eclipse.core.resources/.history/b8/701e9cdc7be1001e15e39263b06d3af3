package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

	
	class Solution {
	    public boolean isAnagram(String s, String t) {
	        
	        if(s.length()!=t.length()){
	            return false;
	        }
	        Map<Character,Integer> mapS= new HashMap<>();
	        Map<Character,Integer> mapT= new HashMap<>();

	        char [] sarr= s.toCharArray();
	        char [] tarr= t.toCharArray();

	        for(char c: sarr){
	           mapS.put(c,mapS.getOrDefault(c, 0)+1);
	        }
	        for(char c: tarr){
	           mapT.put(c,mapT.getOrDefault(c,0)+1);
	        }

	        for(Map.Entry<Character,Integer> entry: mapS.entrySet()){
	            char c= entry.getKey();
	            int count= entry.getValue();

	            if(!mapT.containsKey(c) || mapT.get(c)!= count){
	                return false;
	            }
	        }

	        return true;
	         
	    }
	}
	
	class Solution2 {
	    public boolean isAnagram(String s, String t) {
	        
	        if(s.length()!=t.length()){
	            return false;
	        }
	        char [] sarr= s.toCharArray();
	        char [] tarr= t.toCharArray();
	        Arrays.sort(sarr);
	        Arrays.sort(tarr);
	        for(int i=0;i<sarr.length; i++){
	            if(sarr[i]!= tarr[i]){
	                return false;
	            }
	        }
	        return true;
	    }
	}
}
