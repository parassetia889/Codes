class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : nums1)
            al.add(i);
        
        for(int j : nums2)
            al.add(j);
        
        Collections.sort(al);
        
        if(al.size()%2 == 1)
            return al.get(al.size()/2)*1.0;
        else
            return ((al.get(al.size()/2)*1.0) + (al.get(al.size()/2-1)*1.0))/2;
        
    }
}


// 0 1 2 4