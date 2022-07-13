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
        
        List<List<Integer>> al = new ArrayList<>();
        Queue<TreeNode> dq = new LinkedList<>();
        
        if(root == null)
            return al;
        
        dq.add(root);
        
        while( !dq.isEmpty()){
            
            List<Integer> list = new ArrayList<>();
            int n = dq.size();
            
            for(int i = 0 ; i < n; i++){
                
                TreeNode temp = dq.remove();
                list.add(temp.val);
                
                if(temp.left != null)
                    dq.add(temp.left);
                
                if(temp.right != null)
                    dq.add(temp.right);
            }
            al.add(list);
        }
        return al;
    }
}