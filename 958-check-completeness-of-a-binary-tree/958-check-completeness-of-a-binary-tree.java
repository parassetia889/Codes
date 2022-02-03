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
     private static int countNodes(TreeNode root){
        if(root == null)
            return 0;

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return (1 + leftNodes + rightNodes);
    }
    public boolean isCompleteTree(TreeNode root) {

        int count = countNodes(root);
        return helper(root, 0, count);
    }

    private static boolean helper(TreeNode root, int index, int numberOfNodes) {

        if(root == null)
            return true;

        if(index >= numberOfNodes)
            return false;
        boolean isLeftCompleteBinaryTree = helper(root.left, 2*index +1, numberOfNodes);
        boolean isRightCompleteBinaryTree = helper(root.right, 2*index +2, numberOfNodes);

        return isLeftCompleteBinaryTree & isRightCompleteBinaryTree;
    }
}