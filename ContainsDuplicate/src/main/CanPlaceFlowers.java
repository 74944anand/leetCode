package main;

public class CanPlaceFlowers {

	class Solution {
	    public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        if(n<=0){
	            return true;
	        }
	        if(flowerbed.length==1 && flowerbed[0]==0){
	            n--;
	            return n<=0;
	        }
	        if(flowerbed.length==2 && flowerbed[0]==0 && flowerbed[1]==0){
	            n--;
	            return n<=0;
	        }
	       for(int i=1;i<flowerbed.length-1;i++){
	        if((i-1)==0 && flowerbed[i-1]==0){
	            if(flowerbed[i]==0){
	                n--;
	                flowerbed[i-1]=1;
	            }
	        }
	            if((flowerbed[i-1]==0 && flowerbed[i]== 0) && flowerbed[i+1]==0 ){
	                n--;
	                flowerbed[i]=1;
	                continue;
	            }

	            if((i+1)==flowerbed.length-1 && flowerbed[i+1]==0){
	                if(flowerbed[i]==0){
	                    n--;
	                    flowerbed[i+1]=1;
	                    continue;
	                }
	            }
	       }

	    return n<=0;
	    }
	}
}
