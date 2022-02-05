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
class Pair{
    TreeNode node;
    int visitingCount;
    
    public Pair(TreeNode node){
        this.node = node;
        this.visitingCount = 0;
    }
  
}
class Solution {
       public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();      // a LinkedList to return the output

        if(root == null)
            return list;

        Stack<Pair> stack = new Stack<>();              // a Stack to store nodes while traversing
        stack.push(new Pair(root));

        while( !stack.empty()){
            Pair currPair = stack.peek();
            currPair.visitingCount++;

            if(currPair.node == null)
                stack.pop();
           else if(currPair.visitingCount == 1) {
                Pair leftPair = new Pair(currPair.node.left);
                stack.push(leftPair);
            }
            else if(currPair.visitingCount == 2) {
                Pair rightPair = new Pair(currPair.node.right);
                stack.push(rightPair);
            }
            else //(currPair.visitingCount == 3)
                list.add(stack.pop().node.val);

        }
        return list;
    }
}