class Solution {
    public long countExcellentPairs(int[] nums, int k) {
        
        
        HashSet<Integer> set = new HashSet<>();
       
        for(int i : nums)
            set.add(i);
        
        int n = set.size();
        int[] dis = new int[n];
        
        
        int i = 0;
        for(int num : set)
            dis[i++] = Integer.bitCount(num);
        
        
        Arrays.sort(dis);
        long ans = 0;
        
        for(i = 0; i < n; i++){
            
            int ind = bSearch(dis, k-dis[i]);
            if(ind != -1)
                ans += (n-ind + 0l);
        }
        
        return ans;
    }
    
    private int bSearch(int arr[], int t){
        
        int s = 0, e = arr.length-1;
        int ans = -1;
        
        while(s <= e){
            
            int mid = s + (e-s)/2;
            
            if(arr[mid] < t)
                s = mid + 1;
            else{
                ans = mid;
                e = mid-1;
            }
            
        }
        return ans;
    }
}