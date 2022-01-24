class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0){
            List<String> ans = new ArrayList<>();
            return ans;
        }
        return helper(digits);
    }
    
    public static String getValue(char c){
        String[] arr = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return arr[(c -'0')];
    }
    
    public static List<String> helper(String digits){
        //base Case
        if(digits.length() == 0){
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        String  firstDigitValue = getValue(digits.charAt(0));
        
        List<String> smallAnswer = helper(digits.substring(1));
        
        List<String> ans = new ArrayList<>();
        
        for(int i = 0; i<firstDigitValue.length(); i++){
            for(int j = 0; j<smallAnswer.size(); j++)
             {   String combination = firstDigitValue.charAt(i) + smallAnswer.get(j);
            
            ans.add(combination);}
        }
        return ans;
    }
}