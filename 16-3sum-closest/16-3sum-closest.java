class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        if(nums.length == 3)
            return nums[1]+nums[2]+nums[0];
        
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int n = nums.length, sum = 0, res = 0;
        int maxSum = nums[n-1]+nums[n-2]+nums[n-3];
        
        for(int i = 0; i < n; i++){
            
            int j = i + 1, k = n-1;
            while(j<k){
            sum = nums[i]+nums[j]+nums[k];
           
            if(sum > target)
                k--;
            else
                j++;
            
            if(Math.abs(target-sum) < min){
                res = sum;
                min = Math.abs(target-sum);
            }
        }
    }
        return res;
        
    }
}