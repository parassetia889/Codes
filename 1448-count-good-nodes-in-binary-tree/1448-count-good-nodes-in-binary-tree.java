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
    
    int good = 0;
    int max = Integer.MIN_VALUE;
    
    public int goodNodes(TreeNode root) {
     
        good(root, max);
        return good;
    }
    
    public void good(TreeNode root, int max){
        if(root == null)
            return;
        
        if(root.val >= max)
            good++;
        
        max = Math.max(max, root.val);
        
        good(root.left, max);
        good(root.right, max);
    }
}