class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int n = heights.length;
        HashMap<Integer, String> map = new HashMap<>();
        
        
        for(int i = 0 ; i < n; i++)
            map.put(heights[i], names[i]);
        
        Arrays.sort(heights);
        
        String ans[] = new String[n];
        
        int ind=-1;
        for(int i = heights.length-1; i >= 0; i--)
            ans[++ind] = map.get(heights[i]);
        
        
        return ans;
    }
}