class Solution {
    
    int diameter = 0;
    
    public int height(TreeNode root){
        
        // Algorithm: Result = Max value of (1 + left_subtree_height + right_subtree_height)
        
        // Step 1: Base case
        if(root == null){ return 0; }
        
        // Step 2: Calculate height of left sub tree
        int leftSubTreeHeight = height(root.left);
        
        // Step 3: Calculate height of right sub tree
        int rightSubTreeHeight = height(root.right);
        
        // Step 4: Find & store max value of (1 + left_height + right_height)
        diameter = Math.max(diameter, leftSubTreeHeight + rightSubTreeHeight);
        
        // Step 5: Return height of current node
        return 1 + Math.max(leftSubTreeHeight, rightSubTreeHeight);
        
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        // Step 0 : Calculate the height at each level & store the max value in 'diameter'
        height(root);
        
        return diameter ;
        
    }
}