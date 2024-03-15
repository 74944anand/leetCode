package main;

public class LengthOfLastWord {
	class Solution {
	    public int lengthOfLastWord(String s) {
	        String arr []= s.split(" ");

	        String newS=arr[arr.length-1];

	        return newS.length();
	    }
	}
}
