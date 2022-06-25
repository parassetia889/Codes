class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        
        int index = Integer.MAX_VALUE, diff = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < points.length; i++){
            if(points[i][0] == x || points[i][1] == y){
            
                int temp = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(temp < diff){
                    index = i;  diff = temp;
                }
                
        }
        
       
    }
         return index == Integer.MAX_VALUE ? -1 : index;
}
    
}