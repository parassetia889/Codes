class Solution {
    public int maxConsecutive(int bottom, int top, int[] s) {
        
        Arrays.sort(s);
        int max = Math.max(s[0] - bottom, top-s[s.length-1]);
        
        for(int i = 1; i < s.length; i++){
            max = Math.max(max, s[i]-s[i-1]-1);
        }
        
        return max;
    }
}