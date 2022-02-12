//memoization

class Solution {
    
    HashMap<Integer, Integer> map = new HashMap<>();
    public int fib(int n) {
        if(n <= 1)
            return n;
        
        topDown(n);
        
        return map.get(n);
    }
    
    public int topDown(int n){
        if( n <= 1 ){
            map.put(n,n);
            return  n;
        }
        
        if( !map.containsKey(n)){

             int ans = topDown(n-1) + topDown(n-2);
             map.put(n, ans);
            return ans;
        }
        return map.get(n);
    }
}