class Solution {
    public int hardestWorker(int n, int[][] logs) {
        
        int id = logs[0][0], val = logs[0][1];
        
        for(int i = 1; i < logs.length; i++){
            
            if(logs[i][1]-logs[i-1][1] > val){
                val = logs[i][1]-logs[i-1][1];
                id = logs[i][0];
            }
            else if(logs[i][1]-logs[i-1][1] == val)
                id = Math.min(id, logs[i][0]);
        }
        return id;
    }
}