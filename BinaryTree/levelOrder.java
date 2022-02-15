package Tree;

import com.sun.source.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    public static void levelOrder(TreeNode root){
        Deque<TreeNode> dq = new LinkedList<>();

        if(root != null) {
            dq.add(root);
            dq.add(null);
        }

        while (!dq.isEmpty()){
            TreeNode ele = dq.removeFirst();
            if( ele == null){

                System.out.println();
                if(!dq.isEmpty())
                dq.add(null);
                else
                    break;
            }
            else{
                System.out.print(ele.val+" ");
                if(ele.left != null)
                    dq.add(ele.left);
                if(ele.right != null)
                    dq.add(ele.right);
            }
        }

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(11);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(17);

        levelOrder(root);
    }
}



/*

1 
3 5 
7 11 17 


*/
