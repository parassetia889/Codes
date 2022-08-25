class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i = 0;
        while(i < nums.length){
            if(nums[i] == i+1){
                i++;
                continue;}
            else{
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                if (nums[i] == tmp) {
                    i++;
                } else {
                    nums[tmp - 1] = tmp;
                }
            }
        }
        
         List<Integer> result = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                result.add(j+1);
            }
        }
        
        return result;
        
    }
}