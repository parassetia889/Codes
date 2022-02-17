//https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1#

class Solution {
    // Function to return the diameter of a Binary Tree.
    int maxDiameter = 0;
    int helper(Node root){
        if(root == null)
            return 0;
            
        int leftHeight = helper(root.left);
        int rightHeight = helper(root.right);
        maxDiameter = Math.max(maxDiameter, leftHeight+rightHeight+1);
        
        int maxHeight = Math.max(leftHeight, rightHeight)+1;
        return maxHeight;
    }
    int diameter(Node root) {
        helper(root);
        return maxDiameter;
    }
}
