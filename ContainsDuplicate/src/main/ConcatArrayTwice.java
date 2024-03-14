package main;

public class ConcatArrayTwice {

	
	class Solution {
	    public int[] getConcatenation(int[] nums) {
	            int [] ans= new int[nums.length*2];
	            
	            for(int j=0;j<nums.length;j++){
	                ans[j]=nums[j];
	            }
	            for(int j=0;j<nums.length;j++){
	                ans[nums.length+j]=nums[j];
	            }

	        return ans;
	    }
	}
}
