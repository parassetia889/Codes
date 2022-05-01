class Solution {
    public List<Integer> majorityElement(int[] a) {
        
        List<Integer> list = new ArrayList<>();
         HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < a.length; i++){
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
            
            if(map.get(a[i]) > a.length/3){
                if(!list.contains(a[i]))
                list.add(a[i]);
            }
                
        }
        
       return list;
    }
}