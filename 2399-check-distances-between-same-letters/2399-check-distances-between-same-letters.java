class Solution {
    public boolean checkDistances(String s, int[] distance) {
        
        int arr[] = new int[26];
        
        Arrays.fill(arr,-1);
        
        for(int i = 0; i < s.length(); i++){
            
            int n = s.charAt(i) - 'a';
            
            if(arr[n] != -1 && distance[n] != i-arr[n])
                return false;
            else
                arr[n] = i + 1;
        }
        
        return true;
    }
}