class Solution {
    
    public void solve(String digits, int index, List<String> ans,String output, String[] mapping){
        if(index >= digits.length())
          {  ans.add(output);
            return; }
        
            int number = digits.charAt(index) - '0';
            String value = mapping[number];
        
            for(int i=0; i<value.length(); i++)
            {
                output += (value.charAt(i));
                solve(digits, index+1, ans, output, mapping);
                output = output.substring(0, output.length() - 1);  
               
                
            }
        
    }
    public List<String> letterCombinations(String digits) {
        
        List<String> ans = new ArrayList<String>();
        
        if(digits.length() == 0)
            return ans;
        
        String output = "";
        int index = 0;
        
        String mapping[] = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits, index, ans, output, mapping);
        
        return ans;
    }
}