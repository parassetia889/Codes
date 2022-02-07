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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Stack<TreeNode> pstack = new Stack<>();
        Stack<TreeNode> qstack = new Stack<>();
        
        pstack.push(p);
        qstack.push(q);
        
        while( !pstack.isEmpty()){
            TreeNode temp1 = pstack.pop();
            TreeNode temp2 = qstack.pop();
            
            if(temp1 == null && temp2 == null)
                continue;
            
            if(temp1 == null || temp2 == null)
                return false;
            
            
            if(temp1.val != temp2.val)
                return false;
            
            pstack.push(temp1.left);
            pstack.push(temp1.right);
            qstack.push(temp2.left);
            qstack.push(temp2.right);
            
        }
        return true;
    }
}