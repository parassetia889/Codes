class Solution {
    public int getLucky(String s, int k) {
        
        String str = "";
        
        for(char ch : s.toCharArray()){
            str += (ch-96);
        }
        
        
        while(k-- > 0){
            
            int sum = 0;
            for(int i = 0; i < str.length(); i++){
                sum += str.charAt(i) - '0';
            }
            
            str = String.valueOf(sum);
        }
        
        return Integer.valueOf(str);
    }
}