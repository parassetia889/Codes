class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int k = 0;
        while(k < nums1.length){
            int i = 0, j= 0;
            boolean found = false;
            
            while(nums2[i] != nums1[k]){
                i++; j++;
                }
            while(j < nums2.length){
                if(nums2[j] > nums1[k])
                   { 
                     found = true;
                     break;
                   }
                j++;
             }
            
            if(found)
                nums1[k++] = nums2[j];
            else
                nums1[k++] = -1;
        }
        
        return nums1;
    }
}