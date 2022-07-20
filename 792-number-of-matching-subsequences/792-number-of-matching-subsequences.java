class Solution {
    Map<String,Boolean> map;
    public int numMatchingSubseq(String s, String[] words) {
        map = new HashMap<>();
        int count = 0;
        for(String w:words){
            if(isSubSequence(s,w)) 
                count++;
        }
        return count;
        
        
    }
    
    private boolean  isSubSequence(String s1, String s2){
        int p1 = 0;
        int p2 = 0;
        int len1 = s1.length();
        int len2 = s2.length();
        if(map.containsKey(s2)) return map.get(s2);
         
        while(p1<len1){
            if(s1.charAt(p1)==s2.charAt(p2))
                p2++;
            
                p1++;
            
            if(p2==len2 && p1<=len1){
                map.put(s2,true);
                return true;
            }
        }
        map.put(s2,false);
        return false;
       
    }
}