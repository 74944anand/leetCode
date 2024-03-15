package main;

public class Problem14 {
	
	//Longest Common Prefix
	class Solution {
	    public String longestCommonPrefix(String[] strs) {
	        if(strs.length==0 || strs[0].length()==0){
	            return "";
	        }
	       String prefix = strs[0];
	        for(int i=1;i<strs.length;i++){
	            while(!strs[i].startsWith(prefix)){
	                prefix=prefix.substring(0,prefix.length()-1);
	                if(prefix.length()==0){
	                    return "";
	              }
	            }
	        }
	        return prefix;
	    }
	}
}
