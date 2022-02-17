class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length() == 0 || t.length() == 0)
            return "";
        
        String res = "";
        
        //to keep the count of unique char in window
        Map<Character, Integer> windowMap = new HashMap<>();
        
        // Dictionary which keeps a count of all the unique characters in t.
        Map<Character, Integer> dict = new HashMap<>();
        
        for(char c : t.toCharArray()){    
            dict.put(c, dict.getOrDefault(c,0)+1);
        }
        
        int l = 0, r = 0;
        int matchcount = 0;
        while(r < s.length()){
            
            char c = s.charAt(r);
            windowMap.put(c, windowMap.getOrDefault(c,0)+1);
            
            if(windowMap.getOrDefault(c,0) <= dict.getOrDefault(c,0))
                matchcount++;
                
            while(matchcount == t.length() && l <= r){
                String str = s.substring(l, r+1);
                
                if(res.length() == 0 || str.length() < res.length())
                    res = str;
                
                char ch = s.charAt(l);
                
                if(windowMap.get(ch) == 1)
                    windowMap.remove(ch);
                else
                    windowMap.put(ch,windowMap.get(ch) - 1);
                    
                if(windowMap.getOrDefault(ch,0) < dict.getOrDefault(ch,0))
                    matchcount--;
                
                l++;
            }
            r++;
        }
        
        return res;
    }
}