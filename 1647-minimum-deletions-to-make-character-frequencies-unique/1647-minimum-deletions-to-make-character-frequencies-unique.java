class Solution {
    public int minDeletions(String s) {
        
        
        int[] freq = new int[26];
        
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        
        int count = 0;
        Set<Integer> set = new HashSet<>();
        

        for(int i = 0; i < 26; i++){
            
            //if not unnique
            while(freq[i] > 0 && set.contains(freq[i])){
                freq[i]--;
                count++;
            }
            //if unique
            set.add(freq[i]);
        }
        return count;
        
    }
}