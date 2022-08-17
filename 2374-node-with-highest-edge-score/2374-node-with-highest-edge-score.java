class Solution {
    public int edgeScore(int[] edges) {
        
        long[] arr = new long[edges.length];
        
        for(int i = 0 ; i < edges.length; i++)
            arr[edges[i]] += i;
        
        int ans = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[ans])
                ans = i;
        }
        
        return ans;
    }
}