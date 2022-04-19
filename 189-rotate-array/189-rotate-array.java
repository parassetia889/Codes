class Solution {
    public void rotate(int[] nums, int k) {
        
        
        int n = nums.length;
        if(n==1 || k == n)
            return;
        k %= n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    
    public void reverse(int nums[], int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}


/*

1 2 3 4 5 6 7  k =3
5 6 7 1 2 3 4

7 6 5 4 3 2 1

*/