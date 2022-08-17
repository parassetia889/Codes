class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       HashSet<String> set = new HashSet<>();
        
        for(String word : words){
            String code = "";
            
            for(char c : word.toCharArray())
                code += morse[c-'a'];
            
            set.add(code);
        }
        
       return set.size();
    }
}