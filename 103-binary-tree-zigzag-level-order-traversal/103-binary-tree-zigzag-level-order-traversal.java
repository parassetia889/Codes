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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        boolean leftSe = false;
        while( !q.isEmpty()){
            
            
             LinkedList<Integer> res = new LinkedList<>();
            int  n = q.size();
            for(int i = 0; i < n; i++){
                TreeNode node = q.poll();
                if(node.left != null)   q.add(node.left);
                if(node.right != null)  q.add(node.right);
                
                if(leftSe)
                    res.addFirst(node.val);
                else
                    res.add(node.val);
                
                
            }
            list.add(res);
            leftSe = !leftSe;
        }
        
        return list;
    }
}