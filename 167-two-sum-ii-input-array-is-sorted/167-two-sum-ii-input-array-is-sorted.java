class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length; 
        for(int i = 0; i<n; i++){
            
            int j = binarySearch(numbers, target - numbers[i], i+1);
            if(j != -1)
                return new int[] {i+1, j+1};
        }
        
        throw new IllegalArgumentException("No such sum");
    }
    
    
    public int binarySearch(int nums[], int key, int start){
     
        int s = start, e = nums.length - 1;
        
        while(s <= e){
            
            int mid = s + (e-s)/2;
            if(nums[mid] == key)
                return mid;
            else if(nums[mid] < key)
                s = mid + 1;
            else
                e = mid - 1;
        }
        
        return -1;
    }
}