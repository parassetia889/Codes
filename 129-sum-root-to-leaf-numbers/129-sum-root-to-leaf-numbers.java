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
    
    int total = 0;
    public int sumNumbers(TreeNode root) {
        
        helper(root, 0);
        return total;
    }
    
    public void helper(TreeNode root, int currNum){
        
        if(root == null)
            return ;
        
        currNum = (currNum * 10 )+ root.val;
        if(root.left == null && root.right == null)
            total += currNum;
        else{
            helper(root.left, currNum);
            helper(root.right, currNum);
        }
    }
}