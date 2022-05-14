class Solution {
    public int coinChange(int[] coins, int amount) {
        int min = Integer.MAX_VALUE;
int total = 1;
int[] dp = new int[amount + 1];
dp[0] = 0;
while (total <= amount) {
    min = Integer.MAX_VALUE;
    for (int i = 0; i < coins.length; i++) {
	int diff = total - coins[i];
	if (diff > 0 && dp[diff] > 0 || diff == 0) {
	    min = Math.min(min, dp[diff] + 1);
	}
    }
    dp[total++] = (min == Integer.MAX_VALUE ? -1 : min);
}
return dp[amount];
    }
}