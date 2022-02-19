class Solution {
    public int minimumDeviation(int[] nums) {
        
        TreeSet<Integer> set = new TreeSet<>();
       
        for(int num : nums){
            set.add(num%2==0 ? num : num*2);
            
        }
        
        int min = Integer.MAX_VALUE;
            
            while(true){
                int val =set.last();
                min = Math.min(min, set.last() - set.first());
                
                if(val%2 != 0)
                    break;
                
                set.remove(val);
                set.add(val/2);
            }
     return min;     
    }
}