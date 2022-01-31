class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = nums2.length-1; i >= 0; i--){
            while( !stack.empty() && stack.peek() < nums2[i]){
                stack.pop();
            }
            if(stack.empty())
                map.put(nums2[i] , -1);
            else
                map.put(nums2[i], stack.peek());
            
            stack.push(nums2[i]);
        }
        
        int[] arr = new int[nums1.length];
        for(int i = 0; i< nums1.length; i++)
            arr[i] = map.getOrDefault(nums1[i], -1);
        
        return arr;
    }
}