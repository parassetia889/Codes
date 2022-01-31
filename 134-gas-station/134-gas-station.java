class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    
        
        int tank_gas=0, total_gas=0, start=0;
        
        for(int i=0; i<gas.length; i++) {
            int current = gas[i]-cost[i];
            tank_gas += current;
            total_gas += current;

            if(tank_gas < 0) {
                start = i+1;
                tank_gas = 0;
                }
        }
             return total_gas < 0 ? -1 : start;

    }
}