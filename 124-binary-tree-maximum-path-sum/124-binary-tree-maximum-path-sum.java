/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        helper(root);
        return max;
    }
    
    public int helper(TreeNode root){
        
        if(root == null)
            return 0;
        
        //sum should not be -ve
        int leftSum = Math.max(helper(root.left), 0);
        int rightSum = Math.max(helper(root.right), 0);
        
        max = Math.max(max, leftSum+rightSum + root.val);
        
        return Math.max(leftSum, rightSum) + root.val;
    }
}