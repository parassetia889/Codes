/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   ArrayList<TreeNode>  path;
    ArrayList<Integer> ans;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k){
        path = new ArrayList<>();
        ans = new ArrayList<>();
        findPath(root, target);
        for(int i = 0; i < path.size(); i++){
            goKLevelDeep(path.get(i),k-i,  i == 0 ? null : path.get(i-1) );
        }
        return  ans;
    }
    public boolean findPath(TreeNode root, TreeNode target){

        if(root == null)
            return false;
        if(root == target){
            path.add(root);
            return true;
        }
        boolean isLeftFound = findPath(root.left, target);
        if(isLeftFound) {
            path.add(root);
            return true;
        }

        boolean isRightFound = findPath(root.right, target);
        if(isRightFound) {
            path.add(root);
            return true;
        }

        return false;
    }


    public void goKLevelDeep(TreeNode node, int level, TreeNode obstacle){

        if(node == null || level < 0 || node == obstacle)
            return;
        if(level == 0) {
            ans.add(node.val);
            return;
        }
        goKLevelDeep(node.left,level-1, obstacle);
        goKLevelDeep(node.right, level-1, obstacle);
    }
}
