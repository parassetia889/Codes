class Solution {
    public String intToRoman(int num) {
    HashMap<Integer,String> map = new HashMap<>();
    map.put(1,"I");
    map.put(5,"V");
    map.put(10,"X");
    map.put(50,"L");
    map.put(100,"C");
    map.put(500,"D");
    map.put(1000,"M");

    map.put(4,"IV");
    map.put(9,"IX");
    map.put(40,"XL");
    map.put(90,"XC");
    map.put(400,"CD");
    map.put(900,"CM");

    if(map.containsKey(num)) return map.get(num); 
    String ans = "";
        
    int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        while(num != 0){
            for(int i : arr){
                if(num-i >= 0){
                    num -= i;
                    ans += map.get(i);
                    break;
                }
            }
        }
        
        return ans;
    }
}