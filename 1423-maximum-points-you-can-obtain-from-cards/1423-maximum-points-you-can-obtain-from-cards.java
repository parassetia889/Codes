class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int res = 0,n = cardPoints.length;
        int[] lSum = new int[k + 1],rSum = new int[k + 1];
        for(int i = 0;i < k;i++) {
            lSum[i + 1] = lSum[i] + cardPoints[i];
            rSum[i + 1] = rSum[i] + cardPoints[n - 1 - i];
        }
        for(int i = 0;i < k + 1;i++){
            res = Math.max(res, lSum[i] + rSum[k - i]);
        }
        return res;
    }
}