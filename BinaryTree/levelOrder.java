package Tree;

import com.sun.source.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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

    public static void buildFromLevelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data for root");
        int n = sc.nextInt();
        root = new TreeNode(n);

        q.add(root);
        while ( !q.isEmpty()){
            TreeNode temp = q.poll();

            System.out.println("Enter left node for "+temp.val);
            int left = sc.nextInt();

            if(left != -1) {
                temp.left = new TreeNode(left);
                q.add(temp.left);
            }
            System.out.println("Enter right data for "+ temp.val);
            int right = sc.nextInt();

            if(right != -1) {
                temp.right = new TreeNode(right);
                q.add(temp.right);
            }

        }
        levelOrder(root);
    }
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(3);
//        root.left.left = new TreeNode(7);
//        root.left.right = new TreeNode(11);
//        root.right = new TreeNode(5);
//        root.right.left = new TreeNode(17);

        TreeNode root = null;
        buildFromLevelOrder(root);

    }
}
