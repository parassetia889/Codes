class Solution {
    public boolean checkDistances(String s, int[] distance) {
        
        int arr[] = new int[26];
        
        Arrays.fill(arr,-1);
        
        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            if(arr[ch-'a'] != -1){
                if(i - arr[ch-'a']-1 != distance[ch-'a'])
                    return false;
            }else
                arr[ch-'a'] = i;
        }
        
        return true;
    }
}