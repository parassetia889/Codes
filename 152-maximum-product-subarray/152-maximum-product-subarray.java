class Solution {
    public int maxProduct(int[] arr) {
        
        int pro1 = arr[0], pro2 = arr[0], result = arr[0];
        
        for(int i =1; i < arr.length; i++){
            int temp = Math.max(arr[i], Math.max(arr[i]*pro1, arr[i]*pro2));
            pro2 = Math.min(arr[i], Math.min(arr[i]*pro1, arr[i]*pro2));
            
            pro1 = temp;
            
            result = Math.max(result, pro1);
        }
        return result;
    }
}