class Solution {
    public int smallestEvenMultiple(int n) {
        int ans = 0;
        
        for(int i = 1; i <= 10; i++){
            if(i*n %2 == 0)
                return i*n;
        }
        return ans;
    }
}