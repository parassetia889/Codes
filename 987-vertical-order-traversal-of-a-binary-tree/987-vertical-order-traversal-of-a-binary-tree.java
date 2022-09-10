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


class Tupple{
    TreeNode node;
    int row;
    int col;
    
    public Tupple(TreeNode node, int row, int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}
class Solution {
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
            
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tupple> q = new LinkedList<>();
        
        List<List<Integer>> list = new ArrayList<>();
        
        if(root == null)
            return list;
        
        
        q.offer(new Tupple(root, 0,0));
        
        while( !q.isEmpty()){
            
            Tupple tupple = q.poll();
            TreeNode node = tupple.node;
            int x = tupple.row;
            int y = tupple.col;
            
            if( !map.containsKey(x))
                map.put(x, new TreeMap<>());
            
            if( !map.get(x).containsKey(y))
                map.get(x).put(y, new PriorityQueue<>());
            
            map.get(x).get(y).offer(node.val);
            if(node.left != null)
                q.offer(new Tupple(node.left, x-1, y+1));
            
            if(node.right != null)
                q.offer(new Tupple(node.right, x+1, y+1));
            
        }
        
        for(TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()){
            
            list.add(new ArrayList<>());
            
            for(PriorityQueue<Integer> pq : ys.values()){
                while( !pq.isEmpty())
                    list.get(list.size()-1).add(pq.poll());
            }
        }
        return list;

        
    }
} 