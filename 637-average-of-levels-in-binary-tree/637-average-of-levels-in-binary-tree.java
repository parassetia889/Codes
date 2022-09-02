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
    public List<Double> averageOfLevels(TreeNode root) {
        
        if(root == null)
            return new ArrayList<>();
        
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while( !q.isEmpty()){
            int n = q.size();
            long sum = 0;
            int count = 0;
            
            for(int i = 0; i < n; i++){
                TreeNode node = q.poll();
                sum += node.val;
                count++;
                if(node.left != null)
                    q.offer(node.left);
                
                if(node.right != null)
                    q.offer(node.right);
             }
            list.add(sum*1.0/count);
            
        }
        
        return list;
    }
}