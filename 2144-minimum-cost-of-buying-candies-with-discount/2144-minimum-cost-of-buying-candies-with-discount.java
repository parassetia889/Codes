class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int totalCost = 0;
        int x = 1;
        for(int i = cost.length-1; i>=0 ;i--)
        {
            if((x%3!=0))
               totalCost += cost[i];
                x++;
              
        }
        return totalCost;
    }
}