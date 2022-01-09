import java.util.*;
class Solution {
    
    HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    
    public int climbStairs(int n) {
       
        if(cache.containsKey(n))
            return cache.get(n);
        
        int result = -1;
        if(n < 0 )
            result = 0;
        else if(n == 0)
            result = 1;
        else
            result = climbStairs(n-1) + climbStairs(n-2);
        
        cache.put(n, result);
        return result;
        
    }
}