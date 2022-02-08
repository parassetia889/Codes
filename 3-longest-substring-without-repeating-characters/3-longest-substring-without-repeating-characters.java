class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int forward = 0;  //pointer to include characters in window
        int last = 0;      //pointer to exclude characters from window
        int size = 0;
        HashSet<Character> hash = new HashSet<>();
        
        while(forward < s.length()){
            
            if(!hash.contains(s.charAt(forward))){
                hash.add(s.charAt(forward));
                forward++;
                size = Math.max(size, hash.size());
            }
            else{
                hash.remove(s.charAt(last));
                last++;
            }
        }
        
        return size;
    }
}