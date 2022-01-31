class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int gain = 0;
        int start = 0;
        int consumption = 0;
        for(int i = 0; i < gas.length; i++){
            int currentGas = gas[i];
            int currentCost = cost[i];
            gain =  gain + currentGas - currentCost;
            
            if(gain < 0){
                start = i+1;
                consumption = consumption + gain;
                gain = 0;
            }
        }
        
        if(gain + consumption >= 0)
            return start;
        
        
        return -1;
    }
}