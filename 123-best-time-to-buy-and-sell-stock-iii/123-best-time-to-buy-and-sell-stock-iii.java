class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int maxProfitFront = 0;
        int maxProfitBack = 0;
        int minFront = arr[0];
        int maxBack = arr[n-1];
        int[] t = new int[n];
        int ans = 0;
        t[0] = 0;
        for (int i = 1; i < n; i++) {
            maxProfitFront = Math.max(maxProfitFront,arr[i] - minFront);
            minFront = Math.min(minFront,arr[i]);
            t[i] = maxProfitFront;
        }
        for (int i = n-2; i >= 0; i--) {
               maxProfitBack = Math.max(maxProfitBack,maxBack - arr[i]);
               maxBack = Math.max(maxBack,arr[i]);
               t[i] += maxProfitBack;
               ans = Math.max(ans,t[i]);
        }
        return ans;
    }
}
