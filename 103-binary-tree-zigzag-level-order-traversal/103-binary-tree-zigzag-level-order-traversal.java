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
       
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> dq = new LinkedList<>();
        
        if(root != null)
            dq.add(root);
        else 
            return res;
        
       int rightSe = 0;
        
        while( !dq.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            int n = dq.size();
            
            if(rightSe == 0){
                for(int i = 0; i < n; i++){
                    TreeNode node = dq.removeFirst();
                    ans.add(node.val);
                    if(node.left != null)
                        dq.addLast(node.left);
                    if(node.right != null)
                        dq.addLast(node.right);
                }
            }
            else{
                for(int i = 0; i < n; i++){
                    TreeNode node = dq.removeLast();
                    ans.add(node.val);
                    if(node.right != null)
                        dq.addFirst(node.right);
                    if(node.left != null)
                        dq.addFirst(node.left);
                }
            }
            
             res.add(ans);
             rightSe = (rightSe+1)%2;
             
        }
        
        return res;
    }
}