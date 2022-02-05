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
   public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();      // a LinkedList to return the output
        Stack<TreeNode> stack = new Stack<>();              // a Stack to store nodes while traversing
        if (root != null) {
            stack.add(root);                    // add the root node to the stack
        }
        while (!stack.isEmpty()) {              // iterate the while loop until the stack is empty
            TreeNode node = stack.pop();        // pop the top node from the stack
            list.addFirst(node.val);            // add current node value to the list
            if (node.left != null) {
                stack.add(node.left);           // push left child to stack if it is not null
            }
            if (node.right != null) {
                stack.add(node.right);          // push right child to stack if it is not null
            }
        }
        return list;
    }
}