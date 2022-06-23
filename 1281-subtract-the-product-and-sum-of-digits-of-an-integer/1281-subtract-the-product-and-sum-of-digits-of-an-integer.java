class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum = 0, pro = 1, rem = 0;
        while(n != 0){
            rem = n % 10;
            sum += rem;
            pro *= rem;
            
            n /= 10;
        }
        
        return (pro - sum);
    }
}