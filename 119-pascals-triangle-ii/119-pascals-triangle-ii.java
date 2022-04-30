class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i <= rowIndex; i++){
            long ans = comb(rowIndex, i);
            list.add((int)ans);
        }
        return list;
    }
    
    public long comb(int n, int r){
        
        long res = 1;
        for(int i = 0; i < r; i++){
           res *= (n-i);
            res /= (i + 1);
            
        }
        return res;
    }
}