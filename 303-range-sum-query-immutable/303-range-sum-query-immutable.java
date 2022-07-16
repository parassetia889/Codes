class NumArray {
    
    public int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums; 
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        if(left <= right){
            for(int i=left; i<right+1; i++){
                sum += nums[i];
            }
        }
        return sum;
    }
}