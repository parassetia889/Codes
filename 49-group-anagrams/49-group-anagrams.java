class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        HashMap<String, List<String>> map = new HashMap<>();
        
        
        for(String str : strs){
            
            
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String newStr = new String(arr);
            
            if(map.containsKey(newStr)){
                
                map.get(newStr).add(str);
            }
            else{
                List<String> al = new ArrayList<>();
                al.add(str);
                map.put(newStr,al);
            }
            
   }
         List<List<String>> res = new ArrayList<>();
        
        // for(Map.Entry<String, List<String>> s : map.entrySet()){
        //     res.add(s.getValue());
        // }
        
         res.addAll(map.values());
        
        return res;
    }
}