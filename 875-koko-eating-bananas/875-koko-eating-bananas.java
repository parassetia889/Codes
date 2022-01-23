class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1, high = 1000000000;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            int totalHours = 0;
            for(int p:piles)
               totalHours += Math.ceil((double)p/mid);
               
            
        if(totalHours > h)
            low = mid+1;
        else
            high = mid-1;
        }
       
        return low;
    }
    
    
}