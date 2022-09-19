// ["root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"]

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        for(String path : paths){
            
            String[] values = path.split(" ");
            for(int i = 1; i < values.length; i++){
                
                String[] name = values[i].split("\\(");
                name[1] = name[1].replace(")","");
                List<String> list = map.getOrDefault(name[1], new ArrayList<>());
                list.add(values[0]+"/"+name[0]);
                map.put(name[1], list);
            }
        }
        
       List<List<String>> res = new ArrayList<>();
        for(String key : map.keySet()){
            if(map.get(key).size() > 1)
                res.add(map.get(key));
        }
        
        return res;
    }
}