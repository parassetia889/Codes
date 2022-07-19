class Solution {
    public int maximumSum(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;
        
        for(int num : nums){
            int sum = getSum(num);
            
            if( !map.containsKey(sum))
                map.put(sum, num);
            else{
                 result = Math.max(result, map.get(sum) + num);
                 map.put(sum, Math.max( map.get(sum), num));
            }
               
        }
        
        
        return result;
        
    }
    
    private static int getSum(int num){
     
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}