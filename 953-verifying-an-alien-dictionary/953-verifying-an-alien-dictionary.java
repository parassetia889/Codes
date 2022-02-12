class Solution {
    int[] map;
    
    public boolean isAlienSorted(String[] words, String order) {
        
        map = new int[26];
        int i = 0;
        for(char ch : order.toCharArray())
            map[ch - 'a'] = i++;
                
                
        for(int j = 0; j < words.length-1; j++){
            if(!checkLexographicOrder(words[j], words[j+1]))
                return false;
        }
                
                return true;
    }
    
    public boolean checkLexographicOrder(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        int i = 0, j = 0;
       
      
        
        while(i < l1 && j < l2){
            if(map[s1.charAt(i) - 'a'] < map[s2.charAt(i) - 'a'])
                return true;
            else if(map[s1.charAt(i) - 'a'] > map[s2.charAt(i) - 'a'])
                return false;
            
            i++; j++;
        }  if(l1 > l2)
            return false;
         return true;
    }            
}