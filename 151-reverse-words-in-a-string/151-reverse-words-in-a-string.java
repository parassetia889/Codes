class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.trim().split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = words.length-1; i>=0; i--){
            if(words[i] != "")
            sb.append(words[i].trim() + " ");
        }
        
        //sb.append(words[0].trim());
        return sb.toString().trim();
        
    }
}