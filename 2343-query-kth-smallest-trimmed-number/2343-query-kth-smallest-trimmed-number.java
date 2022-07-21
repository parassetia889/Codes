class Solution {
    
//     class Pair{
//         int index;
//         String str;
        
//         Pair(int i, String s){
//             this.index = i;
//             this.str = s;
//         }
//     }
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        
        int[] ans = new int[queries.length];
        
         PriorityQueue< Pair<Integer, String> > pq;
        int ind = 0;
        
        for(int[] query : queries){
            
            pq = new  PriorityQueue<>((a, b) -> (a.getValue().compareTo(b.getValue()) == 0 ? a.getKey()-b.getKey() : a.getValue().compareTo(b.getValue())) );    
            int x = query[1];  //3
            int k = query[0];  //2
            
            for(int i = 0 ; i < nums.length; i++){
                String str = nums[i].substring(nums[i].length()-x);
                
                pq.add(new Pair<>(i, str));
            }
            
               while(k > 1){
                 pq.remove();
                 k--;
                }
        
            ans[ind++] = pq.peek().getKey();
        }
            
     
        
        return ans;
    }
}