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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root != null)
            q.add(root);
        
        while( !q.isEmpty())
        {
            int n = q.size();
            List<Integer> ans = new ArrayList<>();
            
            for(int i = 0; i<n; i++){
                TreeNode curr = q.remove();
                ans.add(curr.val);
                
                if(curr.left != null)
                    q.add(curr.left);
                
                if(curr.right!= null)
                    q.add(curr.right);
            }
            res.add(ans);
        }
        
        return res;
    }
}