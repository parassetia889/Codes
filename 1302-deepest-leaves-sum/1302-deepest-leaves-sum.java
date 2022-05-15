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
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        
        int depth = findDepth(root);
        findSum(root, 1, depth);
        
        return sum;
    }
    
    public int findDepth(TreeNode root){
        if(root == null)
            return 0;
    
    return 1 + Math.max(findDepth(root.left), findDepth(root.right));
    }
    
    public void findSum(TreeNode root, int currDepth, int depth){
        
        if(root != null){
            if(currDepth == depth)
                sum += root.val;
            
            findSum(root.left, currDepth+1, depth);
            findSum(root.right, currDepth+1, depth);
        }
    }
}