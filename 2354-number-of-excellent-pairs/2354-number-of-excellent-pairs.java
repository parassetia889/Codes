class Solution {
    public long countExcellentPairs(int[] nums, int k) {
        
        
        int n = nums.length;
        HashSet<Integer> set = new HashSet();
        
        for(int i : nums)
            set.add(i);
        
        n = set.size();
        int[] dist = new int[n];
        
        int i = 0;
        for(int num : set)
            dist[i++] = Integer.bitCount(num);
        
        Arrays.sort(dist);
        long ans = 0;
        
        for( i = 0 ; i < dist.length; i++){
            
            int ind = bSearch(dist, k-dist[i]);
            if(ind >= 0)
                  if (ind >= 0) ans += (n - ind + 0l);
        }
        return ans;
            
    }
    
    
    private int bSearch(int arr[], int t){
        
        int s = 0, e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = (s+e)/2;
            
            if(arr[mid] < t)
                s = mid+1;
            else{
                ans = mid;
                e = mid-1;
            }       
        }
        return ans;
    }
}