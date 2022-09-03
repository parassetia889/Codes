class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int num = 1; num < 10; num++)
            dfs(num, num,  k,n-1 , list);
        
        return list.stream().mapToInt(i->i).toArray();
    }
    
    private void dfs(int num, int digit, int k, int n, List<Integer> list){
        
        if(n == 0){
            list.add(num);
            return;
        }
        
        if(digit+k <= 9)
            dfs(num*10+(digit+k), digit+k, k, n-1, list);
        
        
        if( k!= 0 && digit-k >= 0)
            dfs( num*10+(digit-k), digit-k, k,n-1, list);
    }
}