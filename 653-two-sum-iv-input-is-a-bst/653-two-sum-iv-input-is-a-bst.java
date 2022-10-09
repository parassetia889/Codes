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
    HashMap<Integer, Integer> map = new HashMap<>();
    int flag = 0;
    
    public boolean findTarget(TreeNode root, int k) {
        dfs(root, k);
        
        return flag == 1 ? true : false;
    }
    
    public void dfs(TreeNode root, int k){
        
        if(root == null)
            return;
        
        if(map.containsKey(k-root.val))
            flag = 1;
        
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        dfs(root.left, k);
        dfs(root.right, k);
    }
}