class Solution {
    public int fillCups(int[] amount) {
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : amount)
            pq.add(i);
        
        
        int count = 0;
       while(pq.peek() != 0){
           count++;
           int a = pq.remove();
             int b = pq.remove();
           
           pq.add(--a); pq.add(--b);
       }
        
        
        
        return count;
    }
}