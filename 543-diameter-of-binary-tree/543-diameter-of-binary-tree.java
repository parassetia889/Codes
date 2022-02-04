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
    
    int maxDiameter = 0;
    public int height(TreeNode root){
        
        if(root == null)
            return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        
        maxDiameter = Math.max(maxDiameter, 1 + leftHeight + rightHeight);
        
        return (Math.max(leftHeight, rightHeight) + 1);
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        height(root);
        
        return maxDiameter-1;
    }
}