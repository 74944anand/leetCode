package main;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	class Solution {
	    public int majorityElement(int[] nums) {
	        Map<Integer,Integer> map =new HashMap<>();

	        for(int i : nums){
	            map.put(i,map.getOrDefault(i,0)+1);
	        }

	        int maxCount=0;
	        int keyWithMaxCount=0;

	        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
	            int count=entry.getValue();
	            if(count>maxCount){
	                maxCount=count;
	                keyWithMaxCount=entry.getKey();
	            }
	        }

	        return keyWithMaxCount;

	    }
	}
}
