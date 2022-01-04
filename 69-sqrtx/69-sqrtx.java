class Solution {
    public int mySqrt(int x) {
        long s = 0, e = x;
        long ans = -1;
        
        while(s <= e){
            
            long mid = s +  (e-s)/2;
            if(mid*mid == x)
                return (int)mid;
            
            else if(mid*mid < x){
                ans = mid;
                s = mid+1;
                }
            else 
                e = mid-1;
        }
        
        return (int)ans;
        
    }
}


