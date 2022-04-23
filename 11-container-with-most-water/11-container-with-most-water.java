class Solution {
    public int maxArea(int[] height) {
        
        int ans = Integer.MIN_VALUE;
        int i = 0, j = height.length-1;
        
        while(i < j){
            
            ans = Math.max(ans, Math.min(height[i], height[j])*(j-i));
            if(height[j] > height[i])
                i++;
            else if(height[j] < height[i])
                j--;
            else{
                i++;j--;
            }
        }
        return ans;
    }
}