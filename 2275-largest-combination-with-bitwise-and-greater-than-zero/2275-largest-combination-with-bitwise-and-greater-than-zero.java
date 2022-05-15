class Solution {
    public int largestCombination(int[] candidates) {
        
        int arr[] = new int[24];
        
        for(int candidate : candidates){
            int i = 0;
            while(candidate > 0)
            {
                if((candidate&1) == 1) arr[i]++;
                candidate = candidate>>1;
                i++;
            }
        }
        
        return Arrays.stream(arr).max().getAsInt();
    }
}