package main;

public class Problem1299 {
//Replace Elements with Greatest Element on Right Side
	class Solution {
	    public int[] replaceElements(int[] arr) {
	        
	        int maxlength= arr.length;
	        if(maxlength==1){
	            arr[maxlength-1]= -1;
	            return arr;
	        }
	        int temp=arr[maxlength-1];
	        arr[maxlength-1]=-1;
	        
	        for(int i=arr.length-1;i>0;i--){
	           
	           int max=Math.max(temp,arr[i]);
	           temp=arr[i-1];
	           arr[i-1]=max;
	           
	        }
	        return arr;
	    }
	}
	
	
}
