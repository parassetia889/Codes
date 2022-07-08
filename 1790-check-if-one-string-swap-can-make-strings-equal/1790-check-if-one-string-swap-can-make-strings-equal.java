class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        if(Arrays.equals(ch1,ch2)){
            
            int count = 0;
            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i))
                    count++;
            }
            
            if(count == 2 || count == 0)
                return true;
        }
        return false;
    }
}