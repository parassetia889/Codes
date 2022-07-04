class Solution {
    public int candy(int[] ratings) {
        
        int sum = 0, n = ratings.length;
        int[] larray = new int[n];
        int[] rarray = new int[n];
        
        Arrays.fill(larray, 1);
        Arrays.fill(rarray, 1);
        
        for(int i = 1; i < n; i++){
            
            if(ratings[i] > ratings[i-1])
                larray[i] = larray[i-1] + 1;
        }
        
        for(int i = n - 2; i >= 0; i--){
            
            if(ratings[i] > ratings[i+1])
                rarray[i] = rarray[i+1] + 1;
        }
        
        for(int i = 0; i < n; i ++)
            sum += Math.max(larray[i], rarray[i]);
        
        return sum;
    }
}