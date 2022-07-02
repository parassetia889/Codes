class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long mod = (long)1e9 + 7;
        
            
        long maxH = Math.abs(h - horizontalCuts[horizontalCuts.length-1]);
        long maxV = Math.abs(w - verticalCuts[verticalCuts.length-1]);
   
        
        int prev = 0;
        for(int i : horizontalCuts){
            maxH = Math.max(maxH, i - prev);
            prev = i;
        }
            
            
        prev = 0;
        for(int i : verticalCuts){
            maxV = Math.max(maxV, i- prev);
            prev = i;
        }
        
        
        
        
        
        return (int)((maxH * maxV)%mod);

    }
}