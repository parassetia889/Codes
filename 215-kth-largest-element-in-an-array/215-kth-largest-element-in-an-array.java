class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : nums)
            pq.add(i);
        
        
        int c = k -1;
        while(c > 0){
            pq.remove();
            c--;}
        
        return pq.peek();
    }
}