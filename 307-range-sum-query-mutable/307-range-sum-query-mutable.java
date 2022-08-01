class NumArray {

    List<Integer> list = new ArrayList<>();
    int totalSum = 0;
    
    public NumArray(int[] nums) {
        
        for(int i : nums){
            list.add(i);
            totalSum += i;
        }
    }
    
    public void update(int index, int val) {
        
        totalSum = totalSum - list.get(index) + val;
        list.set(index, val);
    }
    
    public int sumRange(int left, int right) {
        
        int sum = totalSum;
        for(int i = 0 ; i < left; i++)
            sum -= list.get(i);
        
        for(int i = right+1 ; i < list.size(); i++)
            sum -= list.get(i);
        
         return sum;
    }
   
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */