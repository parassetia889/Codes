class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] freq = new int[26];
        
        for(char ch : magazine.toCharArray())
            freq[ch-'a']++;
        
        for(char ch : ransomNote.toCharArray()){
            if(freq[ch-'a']-- > 0)
                continue;
            else 
                return false;
        }
        return true;
    }
}