class Solution {
    
    private int next(int n){
        
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n%10,2);
            n /= 10;
            
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        
        Set<Integer> seen = new HashSet<>();
       
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = next(n);
        }
        
        return n == 1;
    }
}