class NumberContainers {

    Map<Integer, TreeSet<Integer>> map;
    Map<Integer, Integer> indexCheck;
    
    public NumberContainers() {
         map = new HashMap<>();
         indexCheck = new HashMap<>();
    }
    
    public void change(int index, int number) {
     
        if(indexCheck.containsKey(index)){
            
            int toReplace = indexCheck.get(index);
            
            //replace in main map
            map.get(toReplace).remove(index);
            
            //if the PQ in map get empty
            if(map.get(toReplace).isEmpty())
                map.remove(toReplace);
            
           
        }
        
            
            indexCheck.put(index, number);
            map.putIfAbsent(number, new TreeSet<Integer>());
            map.get(number).add(index);
            
        
    }
    
    public int find(int number) {
    
        return map.containsKey(number) ? map.get(number).first() : -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */