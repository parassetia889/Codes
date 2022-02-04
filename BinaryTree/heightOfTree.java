package Tree;

import com.sun.source.tree.Tree;

public class heightOfBinaryTree {
    public static int height(TreeNode root){
        if(root == null)
            return 0;
        int leftheight = height(root.left);
        int rightHeight = height(root.right);

        int maxHeight = Math.max(leftheight, rightHeight)+1;
        return maxHeight;
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);

        System.out.println(height(root));
    }
}
