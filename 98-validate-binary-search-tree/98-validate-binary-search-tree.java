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
    ArrayList<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        
        inorderTraversal(root);
        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i) >= list.get(i+1))
                return false;
        }
        return true;
    }
    
    public void inorderTraversal(TreeNode root){
        if(root == null)
            return;
        
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
    }
}