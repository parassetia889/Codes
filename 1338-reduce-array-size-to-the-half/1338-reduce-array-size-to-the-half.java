class Solution {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        
        for(int i : arr)
            map.put(i, map.getOrDefault(i,0)+1);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0, res = 0;
        
        for(int i : map.values())
            pq.offer(i);
        
        
        while(res < n/2 && pq.size()>0){
            res += pq.poll();
            count++;
        }
        
        return count;
    }
}